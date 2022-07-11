package com.maja.sfgdi.controllers;

import com.maja.sfgdi.services.ConstructorInjectedGreetingService;
import com.maja.sfgdi.services.SetterInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;


    @BeforeEach
    void setUp()
    {
        controller=new SetterInjectedController();
        controller.setGreetingService(new SetterInjectedGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}