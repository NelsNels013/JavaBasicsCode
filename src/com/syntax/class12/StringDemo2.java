package com.syntax.class12;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String firstName="Adem";
		String lastName="Jones";
		String fullName= firstName+lastName;
		String fullName2=firstName.concat(lastName); 
		
		String name=" ";
		System.out.println(name.isEmpty());
		//System.out.println(name.isBlank()); does not work for this java version
		
		String str=" never ";
		System.out.println(str.trim());
		
		String captainAmerica=" ne   ver ";
		System.out.println(captainAmerica.trim());

	}

}
