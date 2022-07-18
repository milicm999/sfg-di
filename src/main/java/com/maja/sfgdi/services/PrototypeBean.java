package com.maja.sfgdi.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PrototypeBean {

    public PrototypeBean()
    {
        System.out.println("Creating prototype bean.");
    }

    public String getBeanScope()
    {
        return "I am prototype bean.";
    }
}
