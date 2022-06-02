package com.syntax.class08;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		/*
		 * declare a secret number;
		 * you want to ask user to guess your secret number
		 * your code should keep asking until user gets your secret number
		 * once user gets the secret numbers _. you got it!  
		 */

		int num=5;
		do {
			System.out.println("Guess the secret number");
			num=input.nextInt();
		}while(num!=5); 
			System.out.println("The secret number is "+num);
			
		}
		
		
	}


