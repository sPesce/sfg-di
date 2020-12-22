package spesce.springframework.services;

import org.springframework.context.annotation.Configuration;

/**
 * Created By Steve P. on 12/22/2020
 * original package: spesce.springframework.services
 * ------------------------------------------------------------------------------------------
 */
@Configuration
public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang) {
        switch(lang){
            case "de":
                return new PrimaryGermanGreetingService(greetingRepository);
            case "es":
                return new PrimarySpanishGreetingService(greetingRepository);
            case "en":
            default:
                return new PrimaryGreetingService(greetingRepository);
        }
    }

}
