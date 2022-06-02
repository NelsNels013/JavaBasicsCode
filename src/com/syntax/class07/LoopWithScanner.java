package com.syntax.class07;

import java.util.Scanner;

public class LoopWithScanner {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		/*
		 * we are going to ask you if you got a job
		 * we will continuously asking if you got a job until you say yes!
		 * 
		 * once you say yes --> Congratulations!
		 */
		
		String job;
		
		do {
		   System.out.println("Did you get a job");
		   job=input.nextLine();
		}while(!job.equalsIgnoreCase("yes"));
		
		System.out.println("Congratulations");
		
		System.out.println("--------------------------------------");
		
		String offer;
		System.out.println("Did you get a job");
		offer=input.nextLine();
		
		while(!offer.equalsIgnoreCase("yes")) {
			System.out.println("Did you get a job");
			offer=input.nextLine();
		}
		
		System.out.println("Congratulations");

	}

}
