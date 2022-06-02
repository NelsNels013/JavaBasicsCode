package com.syntax.class02;

public class NonPrimitives {

	public static void main(String[] args) {
		
		String name="Oleg"; //non primitives start with upper case
		//String is non primitive		
		String lastName="smith";
				
		long phone=1234567890l;
		
		//xxx-xxx-xxxx
		
		String phoneNumber="123-456-7890";
		
		String address="123 Washington str";
		
		int age =30;
		String city="Miami";
		//shortcut for printing
		//syso +ctrl +space --> hit enter
		
		/*
		 * we can use + to attach String to String
		 * to attach String to String
		 * to attach String to in
		 * to attach String to double
		 * to any other type
		 */
		System.out.println(name+" "+lastName); //Oleg Smith
		
		//Oleg lives in Miami
		System.out.println(name+" lives in "+city);
		
		//Oleg is 30 years old
		System.out.println(name+ " is " +age+" years old");
		
		/*
		 * rules for identifiers (names)
		 * 1. no spaces
		 * 2. no keywords
		 * 3. cannot start with numbers, but can be used after letter
		 * 4.cannot have special characters, except _ and $
		 */
		//String break="Hello";  error
		
		//int 1number=10;  error
		
		int number1=10;
		
		//int num%=20;  error
		double $price=3.99;
		float f_=2.09f;
		
		/*
		 * Naming Conventions
		 * follow camel casing
		 * variables/methods names should start with lower case and then follow camel casing
		 * class names should start with upper case
		 */
		
		String myCity="Tysons";
	

	}

}
