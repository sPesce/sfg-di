package spesce.springframeworkj.sfgdl.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created By Steve P. on 11/20/2020
 * original package: spesce.springframeworkj.sfgdl.services
 * ------------------------------------------------------------------------------------------
 */
@Profile("EN")
@Service("i18nService")
public class I18nGreetingServiceEnglish implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World -- EN";
    }
}
