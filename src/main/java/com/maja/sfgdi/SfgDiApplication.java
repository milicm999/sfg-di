package com.maja.sfgdi;

import com.maja.sfgdi.controllers.*;
import com.maja.sfgdi.services.PrototypeBean;
import com.maja.sfgdi.services.SingletonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");//here we instanced new object of MyController
		//we do not provide instance of controller, we simply asked Spring context to provide it for us through beans and IoC container
		//so the framework is going out and creating those objects for you and providing those instantiated objects

		System.out.println(myController.sayHello());

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		ConstructorInjectedController constructorInjectedController=(ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());

		I18nController i18nController=(I18nController) ctx.getBean("i18nController");

		System.out.println(i18nController.sayHello());

		PetController petController=(PetController) ctx.getBean("petController");

		System.out.println(petController.getBestPet());

		SingletonBean singletonBean1=(SingletonBean) ctx.getBean(SingletonBean.class);
		SingletonBean singletonBean2=(SingletonBean) ctx.getBean(SingletonBean.class);
		System.out.println(singletonBean1.getBeanScope());
		System.out.println(singletonBean2.getBeanScope());

		PrototypeBean prototypeBean1=(PrototypeBean) ctx.getBean(PrototypeBean.class);
		System.out.println(prototypeBean1.getBeanScope());
		PrototypeBean prototypeBean2=(PrototypeBean) ctx.getBean(PrototypeBean.class);
		System.out.println(prototypeBean2.getBeanScope());
	}
}
