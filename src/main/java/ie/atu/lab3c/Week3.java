package ie.atu.lab3c;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class Week3
{
    @GetMapping("/message")
    public String getMessage()
    {
        return "Messages";
    }
}
