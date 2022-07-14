package com.maja.sfgdi.config;

import com.maja.sfgdi.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
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
    I18nEnglishService i18nEnglishService()
    {
        return new I18nEnglishService();
    }

    @Profile("ES")
    @Bean("i18nService")
    I18nSpanishService i18nSpanishService()
    {
        return new I18nSpanishService();
    }


}
