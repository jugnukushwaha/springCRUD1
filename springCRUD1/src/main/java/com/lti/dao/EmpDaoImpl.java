package com.lti.dao;

import java.util.ArrayList;
import java.util.List;

import com.lti.entity.Employee;

public class EmpDaoImpl implements EmpDao {
	List<Employee> empList = new ArrayList<Employee>();

	public List<Employee> getEmpList() {

		System.out.println("Inside EmpDao Impl");

		Employee e1 = new Employee(101, "Jugnu", 100000);
		Employee e2 = new Employee(102, "Sunny", 50000);
		Employee e3 = new Employee(102, "Saurav", 70000);
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		return empList;
	}

	public List<Employee> addEmp(Employee e) {
		empList.add(e);
		return empList;

	}

	public int updateEmp(int empNo, int empSal) {
		for (Employee e : empList) {
			int no = e.getEmpNo();

			if (no == empNo) {
				e.setEmpSal(empSal);
			}
		}
		return empNo;
	}

}
