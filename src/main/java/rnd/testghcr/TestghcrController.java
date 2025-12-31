package rnd.testghcr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestghcrController {
    
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }  
}
