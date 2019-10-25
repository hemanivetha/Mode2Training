package com.hcl.hib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employ")
public class Employ {
	private int empno;
	private String name;
	private String dept;
	private String desig;
	private int basic;
	
	@Id
	@Column(name="empno")
	public int getEmpno() {
		return empno;
	}
	@Column(name="empno")
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	@Column(name="name")
	public String getName() {
		return name;
	}
	@Column(name="name")
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="dept")
	public String getDept() {
		return dept;
	}
	@Column(name="dept")
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Column(name="desig")
	public String getDesig() {
		return desig;
	}
	@Column(name="desig")
	public void setDesig(String desig) {
		this.desig = desig;
	}
	@Column(name="basic")
	public int getBasic() {
		return basic;
	}
	@Column(name="basic")
	public void setBasic(int basic) {
		this.basic = basic;
	}

}
