package com.hcl.fi;

import java.util.function.Consumer;

public class MethodRefMain {
	
	public static void main(String[] args) {
		MethodRefInterface m=(a)->{System.out.println(a);};
		m.someMethod("Hi Hema");
		
		MethodRefInterface m1=System.out::println;
		m1.someMethod("Welcome to HCL");
		
		Consumer<String> c=System.out::println;
		c.accept("Have a Nice Day");
				
	}

}
