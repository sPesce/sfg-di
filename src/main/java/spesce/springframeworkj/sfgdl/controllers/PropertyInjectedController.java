package spesce.springframeworkj.sfgdl.controllers;

import spesce.springframeworkj.sfgdl.services.GreetingService;

/**
 * Created By Steve P. on 11/20/2020
 * original package: spesce.springframeworkj.sfgdl.controllers
 * ------------------------------------------------------------------------------------------
 */
public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
