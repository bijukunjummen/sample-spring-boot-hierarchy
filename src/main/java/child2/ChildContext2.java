package child2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import root.RootBean;

@SpringBootApplication
@PropertySource("classpath:/child2.properties")
public class ChildContext2 {

    @Bean
    public ChildBean2 childBean(RootBean rootBean, @Value("${root.property}") String someProperty) {
        return new ChildBean2(rootBean, someProperty);
    }
}
