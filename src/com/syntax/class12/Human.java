package com.syntax.class12;

public class Human {
	
	String name; // attributes/properties/fields
	int age;
	double weight;
	char gender;
	//methods/ functions/behaviors
	void walk() {
		
		System.out.println("I can walk");
		
	}
	
	public static void main(String[] args) {
		Human mante=new Human();
		mante.name="Funny Mante";
		mante.age=23;
		mante.weight=182;
		mante.gender='M';
		mante.walk();
	}

}

//in java its convention to call the attributes as fields and call the behaviors as methods
//Rules:
//we can define the fields and methods anywhere in the class