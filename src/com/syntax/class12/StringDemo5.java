package com.syntax.class12;

public class StringDemo5 {

	public static void main(String[] args) {
		
		String str="Mante is funny, Mante is handsome, and he is built";
		//System.out.println(str.charAt(2));
		//System.out.println(str.charAt(5));
		
		int counter=0;
		for(int i=0; i<str.length(); i++) {
			if('s'==str.charAt(i)) {
				counter++;
			}
			//System.out.println(str.charAt(i));
		}
		System.out.println("s appeared "+counter+" times in the string");
	}

}
