package com.hcl.samples.java8;

public class WithLamExpWithReturn {
	
	public static void main(String[] args) {
		MyIntWithReturn mi=(var1,var2)->(var1+var2);
		int res=mi.addTwoNumbers(10, 20);
		System.out.println(res);
		
		MyIntWithReturn mi1=(var1,var2)->{return(var1+var2);};
		int res1=mi1.addTwoNumbers(30, 40);
		System.out.println(res1);

	}
}