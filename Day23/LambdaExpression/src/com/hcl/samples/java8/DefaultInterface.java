package com.hcl.samples.java8;

public interface DefaultInterface {
	
	default void printHello(){
		System.out.println("Hello Default");
	}
	
	static void  printStatic(){
		System.out.println("Hello Static");
	}

}
