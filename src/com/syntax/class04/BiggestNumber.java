package com.syntax.class04;

public class BiggestNumber {

	public static void main(String[] args) {
		
		int a=56;
		int b=34;
		int c=23;
		
		if (a>=b) {
			if (a>=c) {
				System.out.println(a+" is the largest number");
			}else {
				System.out.println(c+" is largest number");
			}
		}else {
			if (b>=c) {
				System.out.println(b+" is the largest number");
			}else {
				System.out.println(c+" is the largest number");
			}
		}
		
	}
}
