package com.simplilearn.collections.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.simplilearn.collections.Employee;

public class TestEmployeeMap {
    //	WAP  for a map
	// id and name
	// id -> key -> Integer
	// name -> value -> String
	// find a employee with id.
	
	
	public static void main(String[] args) {
		Map<Integer, String> empMap = new HashMap<Integer, String>();
		empMap.put(100, "John");
		empMap.put(101, "Sam");
		empMap.put(102, "Anna");
		empMap.put(103, "Clay");
		empMap.put(104, "Bob");
		empMap.put(105, "Ammy");
		empMap.put(106, "Tina");
		empMap.put(107, "Ketty");
		empMap.put(108, "Paul");
		
		
		
		Set<Integer> allkeys = empMap.keySet();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Employee Id :");
		int allkey = input.nextInt();
		
		
		for(Integer key : allkeys) {
			
			if (allkey==key)
			System.out.println(key + " :-> "+empMap.get(key));
			
			
				
	}
	}}
