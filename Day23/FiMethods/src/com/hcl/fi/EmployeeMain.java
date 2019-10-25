package com.hcl.fi;

public class EmployeeMain {
	
	public static void main(String[] args) {
		EIInt e1=Employee::new;
		Employee e=e1.intemploy(23);
		System.out.println(e.getEmpNo());
		
		EIString e2=Employee::new;
		Employee e3=e2.stremploy("Shiva");
		System.out.println(e3.getEmpName());
		
		EmployeeInterface e5=Employee::new;
		Employee e6=e5.employee(21, "Hema");
		System.out.println(e6.getEmpNo());
		System.out.println(e6.getEmpName());
		
	}

}
