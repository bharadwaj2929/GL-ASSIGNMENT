package com.greatlearning.itsupport.provider;

import com.greatlearning.itsupport.Employee;
import com.greatlearning.itsupport.admin.Service;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Employee emp = new Employee("abhishek", "bharadwaj");
		Service ser = new Service();
		System.out.println("Enter Departments\n");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal\n");
		
		System.out.println("Please give appropriate option:");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
 		System.out.println("Dear abhishek bharadwaj your generated credentials are as follows:");
 		
		switch(option) {
			case 1: System.out.println(ser.generateEmailAddress(emp, "technical"));
					System.out.println(ser.generatePassword());
					break;
			
				    
			case 2: System.out.println(ser.generateEmailAddress(emp, "admin"));
					System.out.println(ser.generatePassword());	 	
					break;
				 	
				 
			case 3: System.out.println(ser.generateEmailAddress(emp, "humanresource"));
					System.out.println(ser.generatePassword());
					break;
				    
				    
			case 4: System.out.println(ser.generateEmailAddress(emp, "legal"));
					System.out.println(ser.generatePassword());	    
					break;	
				    
				    
			default : System.out.println("Error");
			 		  break;
		}
		sc.close();
		
	}
}
