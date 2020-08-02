package com.simplilearn.inner;

public class OuterClass {
	
	public String data = "Secure Data";
	private double price = 40.50;
	
	class InnerClass{
			
		public  void showData() {
			System.out.println("Data : "+ data);
		}
		
		public  void showPrice() {
			System.out.println("Price : "+ price);
		}
	}

}
