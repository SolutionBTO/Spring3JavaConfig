package br.samples.solutionbto.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import br.samples.solutionbto.core.HelloWorld;
import br.samples.solutionbto.core.HelloWorldImpl;

@Configuration
@Import({CustomerConfig.class, SchedulerConfig.class})
public class AppConfig {
	
    @Bean(name="helloBean")
    public HelloWorld helloWorld() {
        return new HelloWorldImpl();
    }
    
    @Bean(name="sayHelloWorld")
    public String sayHelloWorld(){
    	return "Hello World!";
    }
}