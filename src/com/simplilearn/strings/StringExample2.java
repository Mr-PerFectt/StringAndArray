package com.simplilearn.strings;

public class StringExample2 {

	public static void main(String[] args) {
		
		String name  = new String("NOAH");
		
		String firstName= new String("NOAH");
		
		System.out.println("The Name :"+name);
		
		System.out.println("The first Name :"+firstName);
		
		if(name == firstName) {
			System.out.println("Same");
		}else {
			System.out.println("Different");
		}

	}

}
