package com.simplilearn.strings;

public class PerformanceTest {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		
		StringBuffer name = new StringBuffer("John");
		
		for(int i=0 ; i<20000; i++) {
			name.append(" Smith");
		}
		long timeTaken = System.currentTimeMillis() - startTime;
		
		System.out.println("Time For appending by StringBuffer :"+ timeTaken + "ms");
		
		System.out.println("-------------");
		
		long startTime2 = System.currentTimeMillis();
		StringBuilder firstName = new StringBuilder("Doe");
		
		for(int i=0 ; i<20000; i++) {
			firstName.append(" Smith");
		}
		
		long timeTaken2 = System.currentTimeMillis() - startTime2;
		
		System.out.println("Time For appending by StringBuilder :"+ timeTaken2 + "ms");
	}

}
