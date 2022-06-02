package com.syntax.class04;

public class Donor {

	public static void main(String[] args) {
		
		int age=19;
		int weight=120;
		
		if (age>18) {
			System.out.println("You are eligible to donate blood");
		if (weight>110) {
			System.out.println("We can accept you");
		}else {
			System.out.println("We cannot accept you");
		}
		}else {
			System.out.println("You are not eligible to donate blood");
		}
	}
}
