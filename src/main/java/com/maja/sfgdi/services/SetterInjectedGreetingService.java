package com.maja.sfgdi.services;


public class SetterInjectedGreetingService implements GreetingService{

    @Override
    public String sayGreeting()
    {
        return "Hello world--Setter";
    }
}
