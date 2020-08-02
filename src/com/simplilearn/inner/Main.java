package com.simplilearn.inner;

public class Main {

	public static void main(String[] args) {
		OuterClass.InnerClass inObj =  new OuterClass().new InnerClass();
		
		inObj.showData();
		
		inObj.showPrice();

	}

}
