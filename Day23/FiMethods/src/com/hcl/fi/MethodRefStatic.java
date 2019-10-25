package com.hcl.fi;
@FunctionalInterface
public interface MethodRefStatic {
	
	public String sayHello(Integer str);
	public static String someMethod(Integer num){
		return "Welcome Static :" +num;
	}

}
