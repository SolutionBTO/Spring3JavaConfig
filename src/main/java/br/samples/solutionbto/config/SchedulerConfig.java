package br.samples.solutionbto.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.samples.solutionbto.core.SchedulerBusiness;

@Configuration
public class SchedulerConfig {
	
	@Bean(name="scheduler")
	public SchedulerBusiness getScheduler(){
		return new SchedulerBusiness();
	}
}
