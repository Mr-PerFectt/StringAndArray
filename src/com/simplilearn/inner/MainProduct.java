package com.simplilearn.inner;

public class MainProduct {

	public static void main(String[] args) {
		
		Shopping.ShowProduct showproduct = new Shopping().new ShowProduct();
		
		showproduct.showProductByName();
		System.out.println("-------------------");
		showproduct.showProductByCategory();
		System.out.println("-------------------");
		
		Shopping.BuyProduct buyproduct = new Shopping().new BuyProduct();
		
		buyproduct.showProductPrice();
		System.out.println("-------------------");
		buyproduct.showProductLastPrice();
		System.out.println("-------------------");
	}

}
