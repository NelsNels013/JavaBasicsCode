package com.syntax.class07;

public class Task {

	public static void main(String[] args) {
		
		//print even numbers from 20 to 100
		System.out.println();
		
		int a=100;
		
		while(a>=1) {
			System.out.print(a+" ");
			a--;
		}
		
		//print even numbers from 20 to 100
		System.out.println();
		
		int b=20;
		
		while(b<=100) {
			System.out.print(b+" ");
			b+=2;
		}
		
		//print only odd numbers from 100 to 1;
		System.out.println();
		
		int c=99;
		
		while(c>=1) {
			System.out.print(c+" ");
			c-=2;
		}
		
		//2nd method
		System.out.println();
		
		int d=100;
		
		while(d>=1) {
			
			if(d%2!=0) {
				System.out.print(d+" ");
			}
			d--;
		}
	}

}
