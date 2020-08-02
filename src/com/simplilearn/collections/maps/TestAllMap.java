package com.simplilearn.collections.maps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestAllMap {

	public static void main(String[] args) {
		// Map : is a key value paired collection
		// Implementation classes : HashMap , HashTable , TreeMap
		
		// phonebook
		
		Map<String, String> phonebook = new HashMap<String, String>();
		
		phonebook.put("John", "9966996699");
		phonebook.put("Mike", "8966896689");
		phonebook.put("Wiliam", "9855985598");
		phonebook.put("Amit", "9855985111");
		phonebook.put("Vijay", "9955985011");
		phonebook.put("Johny", "9966996699");
		
		System.out.println(phonebook);		
		System.out.println("Mike Number is "+phonebook.get("Jony"));
		
		
		// fetch all keys from 
		Set<String> allkeys = phonebook.keySet();
		System.out.println(allkeys);
		
		// Enhanced for loop
		for(String key : allkeys) {
			System.out.println(key + " :-> "+phonebook.get(key));
		}
		
		 
		Map<String, Double> listOfItems = new Hashtable<String, Double>();
		
		listOfItems.put("apple", 44.7);
		listOfItems.put("ornage", 54.7);
		listOfItems.put("banana", 14.7);
		listOfItems.put("kiwi", 24.7);
		listOfItems.put("grapes", 74.7);		
		System.out.println("List of Frues and Price :"+listOfItems);
		
		Map<Integer, String> listOfStudent = new TreeMap<Integer, String>();
		listOfStudent.put(5, "Mike");
		listOfStudent.put(1, "John");
		listOfStudent.put(2, "Wiliam");
		listOfStudent.put(3, "Marry");
		listOfStudent.put(4, "Vijay");
		System.out.println("----------------------");
//		System.out.println(listOfStudent.descendingMap());
//		TreeMap<Integer, String> reverseMap = (TreeMap)listOfStudent.descendingMap();
		System.out.println("----------------------");
		// enhance for loop
		// Entry Map
		for (Map.Entry student : listOfStudent.entrySet()) {
			System.out.println(student.getKey()  +" :-> "+student.getValue());
		}
		

	}

}
