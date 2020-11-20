package spesce.springframeworkj.sfgdl.services;

import org.springframework.stereotype.Service;

/**
 * Created By Steve P. on 11/20/2020
 * original package: spesce.springframeworkj.sfgdl.services
 * ------------------------------------------------------------------------------------------
 */
@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World! -- Constructor";
    }
}
