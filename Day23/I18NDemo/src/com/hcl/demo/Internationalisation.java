package com.hcl.demo;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class Internationalisation {
	public static void main(String[] args) {
		double d=354566.43;
		NumberFormat nf=NumberFormat.getInstance(Locale.ITALY);
		NumberFormat nf1=NumberFormat.getInstance(Locale.US);
		NumberFormat nf2=NumberFormat.getInstance(Locale.CHINA);
		System.out.println("Italy Representation "+d+":"+nf.format(d));
		System.out.println("US Representation "+d+":"+nf1.format(d));
		System.out.println("China Representation "+d+":"+nf2.format(d));
		
		
		DateFormat df=DateFormat.getDateInstance(DateFormat.LONG,new Locale("england","ENGLAND"));
		System.out.println("Short format of Date:"+df.format(new Date()));
		
	}
}
