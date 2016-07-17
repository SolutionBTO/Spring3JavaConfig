package br.samples.solutionbto.core;

public class HelloWorldImpl implements HelloWorld{
	@Override
	public void printHelloWorld(String msg) {
		System.out.println("Hello : " + msg);
	}
}
