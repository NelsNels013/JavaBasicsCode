package com.syntax.class06;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		String country, language;
		
		System.out.println("Enter your country");
		country=input.nextLine();
		
		switch(country.toLowerCase()) {
		
		case "mexico":
			language="spanish";
			break;
		case "usa":
			language="english";
			break;
		case "japan":
			language="japanese";
			break;
		case "russia":
			language="russian";
			break;
		default:
			language="unknown";
			break;
		}
			System.out.println("You are from "+country+" and you speak "+language);
			
			
				
		
		
		

	}

	}
