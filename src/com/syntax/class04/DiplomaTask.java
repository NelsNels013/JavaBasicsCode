package com.syntax.class04;

public class DiplomaTask {

	public static void main(String[] args) {
		
		boolean diploma=true;
		double gpa=4.0;
		
		if (diploma) {
			System.out.println("Congratulations");
			if(gpa>3.5) {
				System.out.println("You are eligible for scholarship");
			}else {
				System.out.println("You should of stduied harder");
			}
		}else {
			System.out.println("You should get your diploma");
		}
	}
}
