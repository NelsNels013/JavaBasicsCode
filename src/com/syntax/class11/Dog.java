package com.syntax.class11;

import java.util.Scanner;

public class Dog {
		//attributes how the object will look like
		String name;
		int age;
		double weight;
		String color;
		double height;
		String breed;
		
		//how that object behave
		void bark() {
			System.out.println("Dog barks");
		}
		void walks() {
			System.out.println("Dog walks");
		}
		void eat() {
			System.out.println("Dogs like to eat bone");
		}
		
		public static void main(String[] args) {
			
			//Scanner input=new Scanner(System.in);
			//input.next();
			Dog pancho=new Dog(); //creating an object and storing in a variable
			pancho.name="Pancho";
			pancho.age=6;
			pancho.weight=16;
			pancho.color="Brown";
			pancho.height=2.6;
			pancho.breed="German";
			pancho.bark();
		}
		

	}