package com.simplilearn.strings;

public class StringExample {

	public static void main(String[] args) {
		
		// Literal String 
		String name = "NOAH";
		
		String firstName = "NOAH";
		
		
		System.out.println("The Name :"+name);
		
		System.out.println("The first Name :"+firstName);
		
//		Note : == operator is used to compare references
		if(name == firstName) {
			System.out.println("Both String has same refence");
		}else {
			System.out.println("String are Different");
		}
		
		System.out.println("--------------");
		// String Methods
		
		char ch = name.charAt(2);
		System.out.println(ch);
		int ln = name.length();
		System.out.println(ln);
		
		for(int i =0 ; i<name.length() ;i++) {
			if('A' == name.charAt(i)) {
				System.out.println("Letter A exist at index "+i);
				
			}else {
				System.out.println("Letter A does notexist at index"+i);
			}
		}
		
		

	}

}
