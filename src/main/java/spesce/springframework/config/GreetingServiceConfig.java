//package spesce.springframework.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.context.annotation.Profile;
//import spesce.springframework.services.GreetingRepository;
//import spesce.springframework.services.GreetingService;
//import spesce.springframework.services.GreetingServiceFactory;
//
///**
// * Created By Steve P. on 12/22/2020
// * original package: spesce.springframework.config
// * ------------------------------------------------------------------------------------------
// */
//@Configuration
//public class GreetingServiceConfig {
//
//    @Bean
//    GreetingServiceFactory greetingServiceFactory(GreetingRepository repo) {
//        return new GreetingServiceFactory(repo);
//    }
//
//    @Bean
//    @Primary
//    @Profile({"default", "en"})
//    GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory) {
//        return greetingServiceFactory.createGreetingService("en");
//    }
//
//    @Bean
//    @Primary
//    @Profile({"es"})
//    GreetingService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory) {
//        return greetingServiceFactory.createGreetingService("es");
//    }
//
//    @Bean
//    @Primary
//    @Profile({"de"})
//    GreetingService primaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory) {
//        return greetingServiceFactory.createGreetingService("de");
//    }
//
//}
