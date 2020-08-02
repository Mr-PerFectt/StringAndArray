package com.simplilearn.collections.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestAllSet {

	public static void main(String[] args) {
		// Set is child interface in Collection
		// Set do not store duplicate values
		// Implementation class : HashSet , LinkendHashSet, TreeSet
		
		// HashSet :uses hashcode of the object to store values
		// HashSet is backed by HashTable
		Set<String> listOfUniqueCompanies = new HashSet<>();
		boolean res1 = listOfUniqueCompanies.add("Dell");
		System.out.println(res1);
		listOfUniqueCompanies.add("Wipro");
		boolean res2 = listOfUniqueCompanies.add("Dell");
		System.out.println(res2);
		listOfUniqueCompanies.add("ABC");
		listOfUniqueCompanies.add(null);		
		System.out.println("Hash Set :"+listOfUniqueCompanies);
		
		System.out.println("------------------------");
		// It store unique elements
		// preserve the insertion order
		Set<String> listOfCity = new LinkedHashSet<>();
		listOfCity.add("Hyderabad");
		listOfCity.add("Mumbai");
		listOfCity.add("Hyderabad");
		listOfCity.add("Bangalore");
		listOfCity.add("Karela");
		System.out.println("Linked Hash Set :"+listOfCity);
		
		
		// TreeSet child class for Set
		// Stores unique element
		// Order collection as asending ( sorted set)
		Set<String> listOfNames = new TreeSet<>();
		listOfNames.add("John");
		listOfNames.add("Mike");
		listOfNames.add("Nihal");
		listOfNames.add("Bryan");
//		TreeSet <String>reverList = (TreeSet)listOfNames.descendingSet();
		
		System.out.println("Tree Set :"+listOfNames);
	}

}
