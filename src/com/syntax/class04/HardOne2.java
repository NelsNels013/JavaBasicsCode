package com.syntax.class04;

import java.util.Scanner;

public class HardOne2 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num1=scan.nextInt();
		
		System.out.println("Enter a different number");
		int num2=scan.nextInt();
		
		if (num1>num2) {
			System.out.println(num1+" is larger than "+num2);
		}else if (num2>num1) {
			System.out.println(num2+" is larger than "+num1);
		}
	}
}
