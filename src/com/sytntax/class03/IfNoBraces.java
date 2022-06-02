package com.sytntax.class03;

public class IfNoBraces {

	public static void main(String[] args) {

		/*
		 * without braces k=java can identify only 1 statement per block
		 */

		String time = "Morning";

		if (time.equals("Morning"))

			System.out.println("Say Good Morning");
		else
			System.out.println("Say Good Day");
		System.out.println("Or say good evening");

		System.out.println("End of the code");

		System.out.println("Make sure to us {} with if statement");
	}

}
