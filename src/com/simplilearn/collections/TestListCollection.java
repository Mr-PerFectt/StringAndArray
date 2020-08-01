package com.simplilearn.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListCollection {

	public static void main(String[] args) {
		// List  : order collection and duplicate allowed.
		
//		List <data-type> list  = new ArrayList<>();
		
		//create  list
		List<String> empList  = new ArrayList<String>();
		
		//add values in list		
		empList.add("John Smith");
		empList.add("Mike Smith");
		empList.add("Wiliam Carl");
		empList.add("Marry David");
		
		System.out.println("Employee List :"+empList);
		System.out.println("Employee List :"+empList.size());
		
		//Iterating a list
		// Iterator
		Iterator<String> itr = empList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("--------------");
		//enhance for loop
		for(String empName: empList) {
			System.out.println("Employee Name :"+ empName);
		}
		
		System.out.println("--------------");
		// normal for loop : for loop with count
		for(int i=0; i<empList.size(); i++) {
			System.out.println("Employe Name :"+empList.get(i) );
		}
	}

	// WAP for creating a student
	//  id, firstName, lastName, marks and address
	// WAP for creating a song
	//  id , name , writer , singer,
}
