package com.maja.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    public SingletonBean()
    {
        System.out.println("Creating Singleton bean");
    }

    public String getBeanScope()
    {
        return "I am Singleton";
    }
}
