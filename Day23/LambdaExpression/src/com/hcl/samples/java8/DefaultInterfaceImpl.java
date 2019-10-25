package com.hcl.samples.java8;

public class DefaultInterfaceImpl implements DefaultInterface {
	
	public static void main(String[] args) {
		new DefaultInterfaceImpl().printHello();
		DefaultInterface.printStatic();
	}

}
