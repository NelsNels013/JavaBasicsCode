package com.sytntax.class03;

public class AdditionOrConcatenation {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		String c="Hello";
		String d="Hi";
		 System.out.println(a+b+c+d); //30HelloHi
		 System.out.println(a+c+b+d); //10Hello20Hi
		 System.out.println(c+d+a+b); //HelloHi1020 (Becomes long String since string is first)
		 
		 System.out.println(c+d+(a+b)); //HelloHi30
		 
		 boolean boo=true;
		 System.out.println(c+boo);
		 
		 

	}

}
