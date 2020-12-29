package spesce.springframework.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import spesce.springframework.examplebeans.FakeDataSource;

/**
 * Created By Steve P. on 12/29/2020
 * original package: spesce.springframework.config
 * ------------------------------------------------------------------------------------------
 */
@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    @Value("${spesce.username}")
    String user;
    @Value("${spesce.password}")
    String password;
    @Value("${spesce.dburl}")
    String url;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }

}
