package com.hcl.samples.java8;

public class WithLambdaExpression {
	
	public static void main(String[] args) {
		MyFunctionalInterface myInterface=()->{System.out.println("Welcome Hema");};
		myInterface.sayMessage();
		
	}

}
