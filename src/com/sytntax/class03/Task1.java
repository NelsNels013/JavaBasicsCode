package com.sytntax.class03;

public class Task1 {

	public static void main(String[] args) {
	
		int a=100;
		
		a+=500;	
		a+=200;
		System.out.println(a);
		
		a-=60;
		System.out.println(a);
		
		int cakePiece=11;
		
		cakePiece/=4;
		System.out.println(cakePiece);
		
		/*
		 * Declare variable cake=25 and
		 * divide cake between 7 people
		 * Using shorthand operator
		 * found out how many pieces of cake
		 * left after it was distributed equally among 7 people
		 */
		
		int cake=25;
		cake%=7;
		
		System.out.println(cake);
		

	}

}
