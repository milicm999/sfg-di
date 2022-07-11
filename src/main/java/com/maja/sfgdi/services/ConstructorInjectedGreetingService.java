package com.maja.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedGreetingService implements GreetingService{

    @Override
    public String sayGreeting()
    {
        return "Hello world--Constructor";
    }
}
