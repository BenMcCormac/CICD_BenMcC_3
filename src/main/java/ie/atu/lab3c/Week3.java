package ie.atu.lab3c;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class Week3
{
    @GetMapping("/message")
    public String getMessage()
    {
        return "Messages";
    }

    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name)
    {
        return "Hello " + name;
    }
    @GetMapping("/details")
    public String getDetails(@RequestParam String name, int age)
    {
        return "Name: " + name + "\nAge: " + age;
    }
    @GetMapping("/calculate")
    public String getResult(@RequestParam String name, int age)
    {
        return "Name: " + name + "\nAge: " + age;
    }
}
