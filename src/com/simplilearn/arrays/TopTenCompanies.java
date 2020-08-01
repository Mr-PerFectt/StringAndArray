package com.simplilearn.arrays;

import java.util.Scanner;

public class TopTenCompanies {

	public static void main(String[] args) {
		
		String topTenCompanies [] = {
				"DELL","INFOSYS","CP","BHELL","EMC","BOA","BOS","SIEMENS"
		};
		
		System.out.println("Welcome to Top 10 Companies ");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your Comapany name to verify :");
		
		String inpComp = input.nextLine();
		int count  =0;
		for(int index =0 ; index < topTenCompanies.length ;index++) {			
			if(topTenCompanies[index].equals(inpComp)) {
				System.out.println("Your Company is listed in top 10 companies and position is "+index+1);
				count = 1;
			}
			
		}
		if(count<=0) {
			System.out.println("Your Company is not in top 10 companies");
		}
	}

}
