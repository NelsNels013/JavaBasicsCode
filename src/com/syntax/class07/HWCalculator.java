package com.syntax.class07;

import java.util.Scanner;

public class HWCalculator {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter two numbers");
		double x = input.nextInt();
		double y = input.nextInt();
		double result=0;
		
		System.out.println("Please enter operator");
		char op = input.next().charAt(0);
		String operator=null;
		
		switch (op) {
		case '*':
			result = x * y;
			break;
		case '/':
			result = x / y;
			break;
		case '+':
			result = x + y;
			break;
		case '-':
			result = x - y;
			break;
		default:
			System.out.println("Invalid Operator");
		}
		if (result !=0 || operator==null) {
			System.out.println(x + " " + op + " " + y + " = " + result);
		}
		
		input.close();

	}

}
