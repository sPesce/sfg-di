package spesce.springframeworkj.sfgdl.controllers;

import org.springframework.stereotype.Controller;
import spesce.springframeworkj.sfgdl.services.GreetingService;

/**
 * Created By Steve P. on 11/18/2020
 * original package: spesce.springframeworkj.sfgdl.controllers
 * ------------------------------------------------------------------------------------------
 */
@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
