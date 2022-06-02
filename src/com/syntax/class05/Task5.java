package com.syntax.class05;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("How much do you need for the loan?");
		int loan=input.nextInt();
		
		if(loan<=200000) {
			System.out.println("I will give you the loan");
		}else {
			System.out.println("I cannot give you the loan");
		}
		
	
		
		
		
		

	}

}
