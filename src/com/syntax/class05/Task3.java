package com.syntax.class05;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter your height in inches");
		int height=input.nextInt();
		
		
		if(height>72) 
			System.out.println("You are tall");
			else if(height<60) 
				System.out.println("You are short");
			else if(height<60&&height>72)
				System.out.println("You are medium");
		
		
		
	}

}
