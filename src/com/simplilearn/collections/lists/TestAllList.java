package com.simplilearn.collections.lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TestAllList {

	public static void main(String[] args) {
		
		
		ArrayList<String> nameList  = new ArrayList<>();
		nameList.add("John");
		nameList.add("same");
		
		// Internally store values as Dynamic Array.
		List <String> listOfComanies  = new ArrayList<>();
		listOfComanies.add("DELL");
		listOfComanies.add("Wipro");
		listOfComanies.add("BOA");
		listOfComanies.add("BOS");
		listOfComanies.add("DELL");
		listOfComanies.set(2, "Simplilearn");	
		
		System.out.println("Array List :- "+listOfComanies);
		System.out.println("---------------");
		
		// Internally store values as Dynamic Array.
		List <String> listOfCity  = new Vector<>();
		listOfCity.add("Hyderabad");
		listOfCity.add("Mumbai");
		listOfCity.add("Pune");
		listOfCity.add("Bangalore");		
		System.out.println("Vector List :- "+listOfCity);
		System.out.println("---------------");
		
		// Internally store values as Doubly Linked List.
		List <String> listOfFruits  = new LinkedList<>();
		listOfFruits.add("Apple");
		listOfFruits.add("Orange");
		listOfFruits.add("Banana");
		listOfFruits.set(1, "Kiwi");
		
		System.out.println("LinkedList List :- "+listOfFruits);
		
	}

}
