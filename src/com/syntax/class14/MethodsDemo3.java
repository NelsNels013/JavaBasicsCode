package com.syntax.class14;

public class MethodsDemo3 {
	
	//Write a method that takes an int value if that value is even this method
	//returns true otherwise it returns false
	
	

	public static void main(String[] args) {

		MethodsDemo3 md=new MethodsDemo3();
		System.out.println(md.isEven(2));
		System.out.println(md.numbers("mante"));


	}
	
	//write a method that takes a String and returns true if number of characters in that String
	//are even otherwise odd
	
    boolean numbers(String mante) {
	if(mante.length()%2==0) {
		return true;
	}else {
		return false;
	}
  }
	
	boolean isEven(int number) {
		
		if(number%2==0) {
			return true;
		}else {
			return false;
		}
	}

}
