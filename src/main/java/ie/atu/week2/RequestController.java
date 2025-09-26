package ie.atu.week2;

import org.springframework.expression.Operation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class RequestController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }

    //Using Get request
    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name){
        return "Hello " + name + "!";
    }

    @GetMapping("/details")
    public String details(@RequestParam String name, @RequestParam int age){
        return "Name: " + name + ", Age: " + age;
    }

    @GetMapping("/person")
    public Person getPerson(){
        return new Person("Smith", 53);
    }

    @GetMapping("/calculate")
    public Result calculate(@RequestParam int num1, @RequestParam int num2, @RequestParam String operation){
        switch (operation){
            case "add":
                return new Result(operation, num1 + num2);
            case "subtract":
                return new Result(operation, num1 - num2);
            case "multiply":
                return new Result(operation, num1 * num2);
            case "divide":
                if (num2 == 0){
                    return new Result("Error. Cant devide by zero", 0);
                }
                return new Result(operation, num1 / num2);
            default:
                return new Result("Error", 0);
        }
    }

}
