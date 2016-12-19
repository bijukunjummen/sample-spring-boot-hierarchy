package child1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChildController {

    @Value("${spring.application.name:notset}")
    private String applicationName;

    @RequestMapping("/myname")
    public String myName() {
        return this.applicationName;
    }
}
