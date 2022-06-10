package com.syntax.class12;

public class StringDemo1 {

	public static void main(String[] args) {
			
		String name=new String("Oleg"); //proper way of creating an object from a class
		
		String name2="Oleg"; //its the same as String name=new String("Oleg");
		//All the classes in java can be treated as data types
		//if a class is present inside the same package or if a class belongs to java.lan package
		name.length();
		
		System.out.println(name.length());
		name2="Mante";
		System.out.println(name2.length());
		
		String name3="Oleg";
		System.out.println(name3.length());
		
		String captain="MANTE";
		System.out.println(captain.toLowerCase());
		captain="I love Java";
		System.out.println(captain.toUpperCase());

	}

}
