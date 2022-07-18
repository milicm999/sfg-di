package com.maja.sfgdi.config;
import com.maja.pets.PetService;
import com.maja.pets.PetServiceFactory;
import com.maja.sfgdi.datasource.FakeDataSource;
import com.maja.sfgdi.repositories.EnglishGreetingRepository;
import com.maja.sfgdi.repositories.EnglishGreetingRepositoryImpl;
import com.maja.sfgdi.services.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;


@ImportResource("classpath:sfgdi-config.xml")
@Configuration
public class GreetingServiceConfig {

    @Bean
    FakeDataSource fakeDataSource(@Value("${com.username}") String username,
                                  @Value("${com.password}") String password,
                                  @Value("${com.jdbcurl}") String jdbcurl)
    {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(username);
        fakeDataSource.setPassword(password);
        fakeDataSource.setJdbcurl(jdbcurl);
        return fakeDataSource;
    }

    @Bean
    PetServiceFactory petServiceFactory()
    {
        return  new PetServiceFactory();
    }

    @Profile({"dog","default"})
    @Bean
    PetService dogService(PetServiceFactory petServiceFactory)
    {
        return petServiceFactory.getPetService("dog");
    }
    @Profile("cat")
    @Bean
    PetService catService(PetServiceFactory petServiceFactory)
    {
        return petServiceFactory.getPetService("cat");
    }
    @Bean
    EnglishGreetingRepository englishGreetingRepository()
    {
        return  new EnglishGreetingRepositoryImpl();
    }

    ConstructorInjectedGreetingService constructorInjectedGreetingService()
    {
        return new ConstructorInjectedGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService()
    {
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService()
    {
        return new SetterInjectedGreetingService();
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService()
    {
        return new PrimaryGreetingService();
    }

    @Profile({"EN", "default"})
    @Bean("i18nService")
    I18nEnglishService i18nEnglishService(EnglishGreetingRepository englishGreetingRepository)
    {
        return new I18nEnglishService(englishGreetingRepository);
    }

    @Profile("ES")
    @Bean("i18nService")
    I18nSpanishService i18nSpanishService()
    {
        return new I18nSpanishService();
    }


}
