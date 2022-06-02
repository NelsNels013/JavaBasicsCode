package com.syntax.class04;

public class MortgageTask {

	public static void main(String[] args) {
		
		double mortgageRate=5.0;
		int mortgagePrice=60000;
		
		if (mortgageRate<4.5) {
			System.out.println("I will not buy a house");
		}else {
			System.out.println("I will consider buying a house");
			if(mortgagePrice<50000) {
				System.out.println("I will take out a loan");
				}else {
					System.out.println("I will pay cash");
			}
			}
		}
		
		
	}

