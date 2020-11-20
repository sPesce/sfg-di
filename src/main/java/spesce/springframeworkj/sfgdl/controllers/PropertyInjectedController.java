package spesce.springframeworkj.sfgdl.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import spesce.springframeworkj.sfgdl.services.GreetingService;

/**
 * Created By Steve P. on 11/20/2020
 * original package: spesce.springframeworkj.sfgdl.controllers
 * ------------------------------------------------------------------------------------------
 */
@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
