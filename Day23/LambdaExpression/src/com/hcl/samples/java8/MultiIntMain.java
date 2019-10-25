package com.hcl.samples.java8;

public class MultiIntMain {
	
	public static void main(String[] args) {
		MultiInterface m=(String name)->{return name;};
		System.out.println(m.sayHello("Hema"));
		
		System.out.println(MultiInterface.add(12, 34));
		
		System.out.println(m.equals("Hema"));
		
		System.out.println(m.defaultMethod(100));
		
	}

}
