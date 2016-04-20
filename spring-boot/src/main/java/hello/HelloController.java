package hello;

import org.burdu.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloWorldService helloWorldService;

    @RequestMapping("/boot")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}