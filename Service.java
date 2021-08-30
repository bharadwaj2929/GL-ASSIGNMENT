package com.greatlearning.itsupport.admin;

import java.util.Random;

import com.greatlearning.itsupport.Employee;

public class Service {

	public char[] generatePassword(){
		String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "~`!@#$%^&*()-_+=/|{}[],.?><;:'";
		String values = upperCaseLetters + lowerCaseLetters + numbers + specialCharacters;
		
		Random rand = new Random();
		char[] password = new char[8];
		for(int i=0;i<8;i++) {
			password[i] = values.charAt(rand.nextInt(values.length()));
		}
		return password;
	}
	
	public String generateEmailAddress(Employee emp, String dept_name) {
		return emp.getFirstName() + emp.getLastName() + "@" + dept_name + ".google.com" ;
		
	}
	public void showCredentials(Employee emp, String emailAddress, char[] generatePassword) {
		System.out.println("Hello "+emp.getFirstName()+emp.getLastName()+" your generated credentials are as follows:");
		System.out.println("EmailAddress -> " + emailAddress);
		System.out.println("Password -> " + "");
		System.out.println(generatePassword);
		
	}
	
}
