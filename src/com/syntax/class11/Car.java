package com.syntax.class11;

public class Car {
	String model;
	String make;
	String color;
	int year;
	String typeOfEngine;
	int noOfDoors;
	int HP;
	
	void moveForward() {
		System.out.println("Car is moving forward");
	}
	
	void reverse() {
		System.out.println("Moving backwards");
	}
	
	public static void main(String[] args) {
		Car audi=new Car();
		audi.model="RS6";
		audi.make="AUDI";
		audi.year=2022;
		audi.typeOfEngine="TwinTurboV8";
		audi.HP=598;
		System.out.println(audi.model);
		audi.moveForward();
		audi.reverse();
		
		Car lexus=new Car();
		lexus.make="Lexus";
		lexus.model="LFA";
		lexus.color="White";
		System.out.println(lexus.model);
		lexus.moveForward();
		
		
	}

}
