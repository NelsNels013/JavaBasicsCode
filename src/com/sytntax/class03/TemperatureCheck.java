package com.sytntax.class03;

public class TemperatureCheck {

	public static void main(String[] args) {
		double temp = 50;

		if (temp < 32) {
			System.out.println("Water will freeze with temperature " + temp);
			System.out.println("It is cold outside");
			System.out.println("Make sure to use a jacket and scarf");
		} else {
			System.out.println("Water will NOT freeze with temperature " + temp);
			System.out.println("It is not that cold outside then");
		}

		System.out.println("Continues code");
		System.out.println("I am code outside of if block");
	}

}