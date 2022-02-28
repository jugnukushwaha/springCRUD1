package com.lti.user;

import java.util.ArrayList;
import java.util.List;

import com.lti.entity.Employee;
import com.lti.services.EmpServices;
import com.lti.services.EmpServicesImpl;

public class UserApp {

	public static void main(String[] args) {
		
		List<Employee> empData = new ArrayList<Employee>();
		
		System.out.println("hello");
		
		EmpServices empService = new EmpServicesImpl();
		empData=empService.getEmpList();	
		System.out.println(empData);
		
		Employee emp = new Employee(104, "Jay", 70000);
		
		empService.addEmp(emp);
		System.out.println(emp.getEmpNo() +"added");
		
		empService.updateEmp(104, 90000);
		System.out.println(empData);
		System.out.println();
	}

}