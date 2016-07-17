package br.samples.solutionbto.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import br.samples.solutionbto.config.AppConfig;
import br.samples.solutionbto.core.CustomerBusiness;
import br.samples.solutionbto.core.HelloWorld;
import br.samples.solutionbto.core.SchedulerBusiness;

/**
 * Exemplo criação de conteiner spring com bean sem uso de xml
 * @author Solutionbto
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		String sayHelloWorld = (String) context.getBean("sayHelloWorld");
		
		CustomerBusiness cu=(CustomerBusiness) context.getBean("customer");
		SchedulerBusiness sh=(SchedulerBusiness) context.getBean("scheduler");

		obj.printHelloWorld("Spring3 Java Config");
		System.out.println(sayHelloWorld);
		
		System.out.println(cu.print("Customer is here!"));
		System.out.println(sh.print("Scheduler is here!"));
	}
}
