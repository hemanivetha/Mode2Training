package com.hcl.fi;

public class CalculatorMain {
	
	public static void main(String[] args) {
		Calculator c=new Calculator();
		Integer ans=c.calc((x,y)->x+y,10,5);
		System.out.println(ans);
		
		Integer ans1=c.calc((x,y)->x-y,10,5);
		System.out.println(ans1);
		
		Integer ans2=c.calc((x,y)->x*y,10,5);
		System.out.println(ans2);
		
		Integer ans3=c.calc((x,y)->x/y,10,5);
		System.out.println(ans3);
		
		Integer ans4=c.calc((x,y)->x%y,10,5);
		System.out.println(ans4);
	}

}
