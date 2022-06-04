package com.syntax.class11;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		int arraySize=input.nextInt();
		String[] countryArray=new String[arraySize];
		
		for(int i=0; i<countryArray.length; i++) {
			countryArray[i]=input.next();
		}
		
		for(String element:countryArray) {
			if(element.equalsIgnoreCase("usa")) {
				System.out.println("Washington DC");
			}else if(element.equalsIgnoreCase("turkey")) {
				System.out.println("Anakara");
			}else if(element.equalsIgnoreCase("thailand")) {
				System.out.println("Bankok");
			}else {
				System.out.println("Country not supported by My Great Java program version 1.0");
			}
		}
	}


	}


