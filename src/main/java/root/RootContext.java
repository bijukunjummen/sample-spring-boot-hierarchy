package root;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(name = "rootPropertySource", value = "classpath:/root.properties")
public class RootContext {

    @Bean
    public RootBean rootBean() {
        return new RootBean();
    }
}
