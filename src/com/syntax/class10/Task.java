package com.syntax.class10;

public class Task {

	public static void main(String[] args) {
		
//		From an array of integer elements find the largest number.
			int[] numbers= {41, 28, 6553, 59, 44, 12, 1, 566};
			
			
			int max=numbers[0];
			
			for(int i=0; i<numbers.length; i++) {
				
				if(numbers[i]>max) {
					
						max=numbers[i];
				}
			}					
			
			System.out.println("The largest number is "+max);
			
			//2nd way 
			
			max=numbers[0];
			
			for(int large:numbers) {
				
				if(large>max) {
					max=large;
				}
			}
		
			System.out.println("The largest number is "+max);
		
			// Create an array to store to store char values
			// and then print those in reverse order
			
			char[] values = { 'A', 'B', 'C', 'D', 'E' };
			
			for (int i=values.length-1; i>=0; i--) {
				
				System.out.print(values[i] + " ");
			}
			

	}

}
