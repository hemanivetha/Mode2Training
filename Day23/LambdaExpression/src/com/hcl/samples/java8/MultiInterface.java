package com.hcl.samples.java8;
@FunctionalInterface
public interface MultiInterface {
	
	public String sayHello(String name);
	
	public static int add(int n1,int n2){return n1+n2;}
	
	boolean equals(Object obj);
	
	default public int defaultMethod(int var){
		return var+100;
	}

}
