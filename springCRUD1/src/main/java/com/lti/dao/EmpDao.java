package com.lti.dao;

import java.util.List;

import com.lti.entity.Employee;

public interface EmpDao {
	
	public List<Employee> getEmpList();
	public List<Employee> addEmp(Employee e);
	public int updateEmp(int empNo,int empSal );

}
