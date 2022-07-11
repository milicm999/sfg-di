package com.maja.sfgdi;

import com.maja.sfgdi.controllers.ConstructorInjectedController;
import com.maja.sfgdi.controllers.MyController;
import com.maja.sfgdi.controllers.PropertyInjectedController;
import com.maja.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");//here we instanced new object of MyController
		//we do not provide instance of controller, we simply asked Spring context to provide it for us through beans and IoC container
		//so the framework is going out and creating those objects for you and providing those instantiated objects

		String greeting = myController.sayHello();
		System.out.println(greeting);

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		ConstructorInjectedController constructorInjectedController=(ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());

	}
}
