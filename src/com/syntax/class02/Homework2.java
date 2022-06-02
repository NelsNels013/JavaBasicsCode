package com.syntax.class02;

public class Homework2 {
	public static void main (String[] args) {
		
		//Task 1
		
		double num1=5.55;
		double num2=2.22;
		double sum, sub, div, mult;
		sub=num1-num2;
		sum=num1+num2;
		div=num1/num2;
		mult=num1*num2;
		
		System.out.println("The subtraction of 2 numbers "+num1+" and "+num2+" is equal to "+sub);
		System.out.println("The addition of 2 numbers "+num1+" and "+num2+" is equal to "+sum);
		System.out.println("The division of 2 numbers "+num1+" and "+num2+" is equal to "+div);
		System.out.println("The multiplication of 2 numbers "+num1+" and "+num2+" is equal to "+mult);
		
		//Task 2
		
		double num3=3.9;
		double num4=3.9;
		
		System.out.println("The square of the "+num3+" is "+num3*num4);
		
		//Task 3
						
		int w=5, h=8;
		int p=2*(w+h);
		int a=w*h;
		
		System.out.println("The perimeter of a rectangle with width "+w+" and hieght"
		+ " "+h+" is equal to "+p+" and the area is "+a);
				
		
	}
}
