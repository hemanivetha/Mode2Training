package com.hcl.fi;


public class InstanceMethodMain {
	
	public static void main(String[] args) {
		InstanceInterface m1=()->{System.out.println("Welcome Hema");};
		m1.myInterface();
		
		InstanceMethodRef m2=new InstanceMethodRef();
		InstanceInterface m3=m2::saySomething;
		m3.myInterface();
		
	}

}
