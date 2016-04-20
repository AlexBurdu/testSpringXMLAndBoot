package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    @Autowired
//    private HelloWorldService helloWorldService;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}