package br.samples.solutionbto.core;

public class CustomerBusiness {
	
	public String print(String msg){
		return getClass().getSimpleName()+" - "+msg;
	}
	
}
