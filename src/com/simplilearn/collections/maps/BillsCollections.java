  
package com.simplilearn.collections.maps;
import java.util.*;
public class BillsCollections {

	public static void main(String[] args) {

		TreeMap<Double, String> bills = new TreeMap<Double, String>();
		bills.put (350.00, " Water Bill");
		bills.put (1200.00, "Internet Bill");
		bills.put (25000.00, " Credit Card Bill ");
		bills.put (10000.00, " Room Rent");
		//Billing in ascending order
		System.out.println("<** Monthly Bills in sorted order based on amount - Ascending **>");
		for (Map.Entry b : bills.entrySet()) {
			System.out.println(b.getKey()+" -> "+b.getValue());
		}
		
		System.out.println();
		System.out.println("--------------------------");
		System.out.println();
		
		//Billing in descending order
		System.out.println("<** Monthly Bills in sorted based on amount - Descending **>");
		Map<Double, String> reverseBills = new TreeMap<>(Collections.reverseOrder());
		reverseBills.putAll(bills);
		for(Map.Entry b : reverseBills.entrySet()) {
			System.out.println(b.getKey()+" -> "+b.getValue());
		}
	}
}