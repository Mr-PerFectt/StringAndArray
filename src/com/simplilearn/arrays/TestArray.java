package com.simplilearn.arrays;

public class TestArray {

	public static void main(String[] args) {
		
		int [] numberList = { 20, 50, 70, 30 ,40 }; // preferred
		
		numberList[2] = 33;
		
//		numberList[1] ="33";
		
		for (int i = 0 ; i< numberList.length ; i++) {
			System.out.println("The index "+i +" containes value "+numberList[i]);
		}
		System.out.println("-------------------");
		
		double numberList2[] = {20.3, 2.9, 7.3};
		
		for (int i = 0 ; i< numberList2.length ; i++) {
			System.out.println("The index "+i +" containes value "+numberList2[i]);
		}
		
		
		String nameList[] = {"John", "Mike", "David"};
		
		for (int i = 0 ; i< nameList.length ; i++) {
			System.out.println("The index "+i +" containes value "+nameList[i]);
		}
	}

}
