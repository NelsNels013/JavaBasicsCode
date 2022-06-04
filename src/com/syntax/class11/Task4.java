package com.syntax.class11;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creat a 2D array where you will store
				//odds and even numbers. Develop a program which will
				//identify/print the even numbers only
				
				int[][] num = { { 10, 12, 85, 36 }, { 51, 11, 52 }, { 100, 150, 165 } };

						for (int i = 0; i < num.length; i++) {
							for (int j = 0; j < num[i].length; j++) {
								if (num[i][j] % 2 == 0) {
									System.out.print(num[i][j] + " ");
								}
							}
						}
	}

}
