package com.lti.services;

import java.util.List;

import com.lti.entity.Employee;

public interface EmpServices {
	
	public List<Employee> getEmpList();
	public List<Employee> addEmp(Employee e);
	public int updateEmp(int empNo,int empSal );

}
