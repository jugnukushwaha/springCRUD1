package com.lti.services;

import java.util.List;

import com.lti.dao.EmpDao;
import com.lti.dao.EmpDaoImpl;
import com.lti.entity.Employee;

public class EmpServicesImpl implements EmpServices {

	private EmpDao empDao;

	public EmpServicesImpl() {

		empDao = new EmpDaoImpl();

	}

	public List<Employee> getEmpList() {
		System.out.println("Inside Services EmpServicesImpl");
		return empDao.getEmpList();
	}

	public List<Employee> addEmp(Employee e) {
		System.out.println("Inside Services EmpServicesImpl");
		return empDao.addEmp(e);
	}

	public int updateEmp(int empNo, int empSal) {
		System.out.println("Inside Services EmpServicesImpl");
		return empDao.updateEmp(empNo, empSal);
	}

}
