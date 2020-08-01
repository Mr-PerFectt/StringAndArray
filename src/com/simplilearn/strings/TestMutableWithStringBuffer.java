package com.simplilearn.strings;

public class TestMutableWithStringBuffer {

	public static void main(String[] args) {
		
		StringBuffer name = new StringBuffer("John");
		
		name.append(" Smith");
		
		System.out.println("The Name :"+name);

	}

}
