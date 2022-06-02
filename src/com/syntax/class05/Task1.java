package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
			
		System.out.println("What is your age?");
		
		int age=scan.nextInt();
			
		if(age>=18) {
			System.out.println("Here is your license");
			
		}else {
			System.out.println("Here is your learners permit");
		}
		
		
		System.out.println("Do you have a credit card?");
		

	}

}
