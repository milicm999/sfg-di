package com.maja.sfgdi.services;


public class ConstructorInjectedGreetingService implements GreetingService{

    @Override
    public String sayGreeting()
    {
        return "Hello world--Constructor";
    }
}
