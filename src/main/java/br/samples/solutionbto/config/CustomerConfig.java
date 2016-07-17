package br.samples.solutionbto.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.samples.solutionbto.core.CustomerBusiness;

@Configuration
public class CustomerConfig {

	@Bean(name="customer")
	public CustomerBusiness getCustomer(){
		return new CustomerBusiness();
	}
	
}
