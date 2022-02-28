package com.lti.entity;

public class Employee {
	private int empNo;
	private String empName;
	private int empSal;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empNo, String empName, int empSal) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empSal = empSal;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "\n Employee [empNo=" + empNo + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

}
