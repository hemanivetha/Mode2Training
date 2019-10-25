package com.hcl.samples.java8;

public class MaxWithLambdaExpression {
	
	public static void main(String[] args) {
		MyMaxInterface m=(x,y)->{int max=x>y?x:y;return max;};
		int res=m.returnMax(19, 1);
		System.out.println(res);
		}
}