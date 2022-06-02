package com.syntax.class08;

public class Task2 {
	
	public static void main(String[] args) {
		
		int sum=0;
		
		for(int i=1; i<6; i++) {
			
			System.out.print(sum+" ");
			
			sum+=i;
			
			//System.out.print(sum+" ");
		}
		
		System.out.println("Value of sum =");
		System.out.println(sum); //15
		
		/*
		*write program to find sum of all even and all odd numbers
		*from 1 to 70
		*/
		
		int sumEven=0;
		
		
		for(int i=2; i<=70; i+=2) {
			
			
			
			sumEven+=i;
		}
		System.out.println("Sum of all evens="+ sumEven);
		
		int sumOdd=0;
		
		for(int i=1; i<=70; i+=2) {
			
			sumOdd+=i;
		}
		System.out.println("Sum of all odds="+ sumOdd);
		
		
		
		
		
	}
	}


