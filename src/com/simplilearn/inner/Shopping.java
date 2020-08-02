package com.simplilearn.inner;

import java.util.ArrayList;
import java.util.List;

public class Shopping {
	
	Product product =  new Product(11122, "Bike", "Vehicle", 599884.22);
	
	// show product
	class ShowProduct{
	
		public void showProductByName() {
			System.out.println("Product is :"+product.getName());
		}
		
		public void showProductByCategory() {
			System.out.println("Product is :"+product.getName()
			+" belongs to category :"+product.getCategory());
		}		
	}
	
	// buy product
	class BuyProduct{
		
		public void showProductPrice() {
			System.out.println("Product is :"+product.getName() 
			+" having price :"+product.getPrice());
		}
		
		public void showProductLastPrice() {
			System.out.println("Product is :"+product.getName() 
			+" having price after deduction :"+(product.getPrice()-1000));
		}
	}
}
