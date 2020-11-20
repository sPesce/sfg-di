package spesce.springframeworkj.sfgdl.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import spesce.springframeworkj.sfgdl.services.GreetingService;

/**
 * Created By Steve P. on 11/20/2020
 * original package: spesce.springframeworkj.sfgdl.controllers
 * ------------------------------------------------------------------------------------------
 */
@Controller
public class I18nController {

    private final GreetingService greetingService;

    public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
