package com.simplilearn.collections;

import java.util.ArrayList;
import java.util.List;

public class TestEmployeeList {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(100, "John Smith", 40000.99, "Dev");
		Employee emp2 = new Employee(101, "Mike Smith", 40000.99, "Dev");
		Employee emp3 = new Employee(102, "Will Smith", 40000.99, "Dev");
		Employee emp4 = new Employee(103, "Marry Smith", 40000.99, "Dev");
		
		//create employee list
		List<Employee> empList = new ArrayList<Employee>();
		
		//add employee object to list
		empList.add(emp1);
		empList.add(emp2);		
		empList.add(emp3);
		empList.add(emp4);
		
		// iterate employee
		for(Employee emp : empList) {
			System.out.println("-------------------------");
			System.out.println("The Employee Name"+emp.getEmpName());
			System.out.println("The Employee Id "+emp.getEmpId());
			System.out.println("The Employee "+emp.getEmpSalary());
			System.out.println("The Employee "+emp.getEmpDepartment());
		}
		

	}

}
