package com.syntax.class08;

import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		//Create a program that will keep asking user to apply for a credit card.
		//As soon you get “yes” from a user program should stop asking.
		
		String CC;
		
		do {
			System.out.println("Do you want to apply to a credit card");
		CC=input.nextLine();
		}while(!CC.equalsIgnoreCase("yes")); 
			System.out.println("Here is your credit card");
		
		
		
		


	}

}
