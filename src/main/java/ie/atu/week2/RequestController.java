package ie.atu.week2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class RequestController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }



}
