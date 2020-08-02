package com.simplilearn.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FetchEmployeeBasedOnId {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(100, "John Smith", 40000.99, "Dev");
		Employee emp2 = new Employee(101, "Mike Smith", 40000.99, "Dev");
		Employee emp3 = new Employee(102, "Will Smith", 40000.99, "Dev");
		Employee emp4 = new Employee(103, "Marry Smith", 40000.99, "Dev");
		
		//create employee list
		List<Employee> empList = new LinkedList<Employee>();
		
		//add employee object to list
		empList.add(emp1);
		empList.add(emp2);		
		empList.add(emp3);
		empList.add(emp4);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Employee Id :");
		int id = input.nextInt();
		
		for(Employee emp :empList ) {
			if(emp.getEmpId()==id) {
				System.out.println("Employee is found with Name : "+emp.getEmpName() 
				+"  which belongs to department "+emp.getEmpDepartment());
			}
		}

	}

}
