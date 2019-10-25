package com.hcl.fi;

public class MethodRefStaticMain {
	
	public static void main(String[] args) {
		MethodRefStatic s1=(a)->{return "Welcome " +a;};
		System.out.println(s1.sayHello(25));
		
		MethodRefStatic s2=MethodRefStatic::someMethod;
		System.out.println(s2.sayHello(45));
	}
	

}
