package com.syntax.class05;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	System.out.println("What day of the week is it?");
	int day=input.nextInt();
	if(day>=1&&day<=5) {
		System.out.println("It is a weekday");
	}else if(day>=6&&day<=7) {
		System.out.println("It is weekend");
	}else {
		System.out.println("Invalid day");
	}

	}
}
