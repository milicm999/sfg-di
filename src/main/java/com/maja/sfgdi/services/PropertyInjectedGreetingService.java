package com.maja.sfgdi.services;

public class PropertyInjectedGreetingService implements GreetingService {

    @Override
    public String sayGreeting()
    {
        return "Hello world--Property";
    }
}
