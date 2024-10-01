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
    public String getResult(@RequestParam  int num1, int num2, String operation)
    {
        int ans = 0;
        switch (operation)
        {
            case "add":
                ans = num1 + num2;
                break;
            case "subtract":
                ans = num1 - num2;
                break;
            case "multiply":
                ans = num1 * num2;
                break;
            case "divide":
                if(num2 == 0)
                {
                    return "ERROR: Can't divide by zero";
                }
                else
                {
                    ans = num1 / num2;
                    break;
                }

            default:
                return "ERROR";
        }

        return "" + ans;
    }
}
