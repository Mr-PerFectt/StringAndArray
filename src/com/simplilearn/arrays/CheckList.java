package com.simplilearn.arrays;

import java.util.Scanner;

public class CheckList {

	public static void main(String[] args) {
		
		String itemInCart [] = {
				"MILK","RICE","APPLE","SOAP","EGG","OIL","BREAD","MASALA","SUGAR,"
		};
		
		System.out.println("Welcome to Your Cart ");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your Item name to verify :");
		
		String inpCart = input.nextLine();
		int count  =0;
		for(int index =0 ; index < itemInCart.length ;index++) {			
			if(itemInCart[index].equals(inpCart)) {
				System.out.println("Your Item Is Already In Cart and Position is "+index+1);
				count = 1;
			}
			
		}
		if(count<=0) {
			System.out.println("Your Item is not in Cart \n \t Buy it ^-^");
		}
	}

}
