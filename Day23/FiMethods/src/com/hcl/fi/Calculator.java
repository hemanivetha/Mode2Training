package com.hcl.fi;

import java.util.function.BiFunction;

public class Calculator {
	
	public Integer calc(BiFunction<Integer, Integer, Integer>bi,Integer n1,Integer n2){
		return bi.apply(n1, n2);
	}

}
