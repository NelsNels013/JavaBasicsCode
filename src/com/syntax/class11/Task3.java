package com.syntax.class11;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create a 2D array of integer values.
				//Print the sum of all numbers.
				
				int [][] number= {
						{1, 23, 65},
						{5, 33, 44},
						{54, 93, 6}
						};
					
				int sum=0;
				
				for(int i=0; i<number.length; i++) {
					for(int j=0; j<number[i].length; j++) {
						sum+=number[i][j];
					}
					
					
				}
				System.out.println("The sum of all values in array is "+sum);

			

		
	}

}
