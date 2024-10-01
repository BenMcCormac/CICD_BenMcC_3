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
                switch (num2)
                {
                    case 0:
                        String error = "ERROR: Can't divide by zero";
                        return error;
                    default:
                        ans = num1 / num2;
                        break;
                }
                break;
            default:
                return "ERROR";
        }

        return "" + ans;
    }
}
