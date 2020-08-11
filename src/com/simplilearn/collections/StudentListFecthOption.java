package com.simplilearn.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StudentListFecthOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student profile1 = new Student(1201230100, "Suvam", "Mohapatra", 92.8, "BTM Layout");
		Student profile2 = new Student(1201230101, "Sai", "Swaroop", 82.5, "Taverekare");
		Student profile3 = new Student(1201230102, "Soumyakanta", "Mishra", 78.4, "JP Nagar");
		Student profile4 = new Student(1201230103, "Amisha", "Prdhan", 88.8, "Sarjapura");
		Student profile5 = new Student(1201230104, "Jigyansa", "Nanda", 62.2, " Electronic City");
		Student profile6 = new Student(1201230105, "Zoya", "Usman", 75.7, "BTM Layout");
		Student profile7 = new Student(1201230106, "Saptasikha", "Dash", 87.8, "Chikka Adugodi");
		Student profile8 = new Student(1201230107, "Ankit", "Ansuman", 52.5, "Sai Nagar");

		List<Student> studentList = new LinkedList<Student>();
		
		studentList.add(profile1);
		studentList.add(profile2);
		studentList.add(profile3);
		studentList.add(profile4);
		studentList.add(profile5);
		studentList.add(profile6);
		studentList.add(profile7);
		studentList.add(profile8);
		
		
		
		for(Student data : studentList) {
			System.out.println("-------------------------");
			System.out.println("First Name :  "+data.getStudentId());
			System.out.println("Song Name : "+data.getFirstName());
			System.out.println("Last Name :  "+data.getLastName());
			System.out.println("Score >> "+data.getMark());
			System.out.println("Address : "+data.getAddress());
			
			}
		
		System.out.println("-------------------------");
		System.out.println("*^*^*^*^*^*^*^*^*^*^*^*^*");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Id No :");
		int id = input.nextInt();
		
		for(Student data :studentList ) {
			if(data.getStudentId()==id) {
				System.out.println("Student Name : "+data.getFirstName() 
				+" "+data.getLastName()+" Secured >> "+data.getMark()+" %  ^_^ ");
			
	          }
						
				
			}

		}
	}


