package com.syntax.class09;

public class HW {

	public static void main(String[] args) {
		
		//Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.

		String[] cars= {"SF90", "Trackhawk", "GT500", "Supra", "WRX", "Accord"};
		
		for(int i=0; i<cars.length; i++) {
			System.out.print(cars[i]+" ");
		}
		
		//2nd way
		
		System.out.println();
		
		for(String car:cars) {
			System.out.print(car+" ");
		}
		
		System.out.println();
		//Create an array of animals and store 5 elements into it. Using 2 different loops print all elements from the array.

		String[] animals= {"dog", "cat", "fish", "bird", "bug"};
		
		for(int i=0; i<animals.length; i++) {
			System.out.print(animals[i]+" ");
		}
		
		System.out.println();
		
		//2nd way
		for(String a:animals) {
			System.out.print(a+" ");
		}
		
		System.out.println();
		//Create an array to store double values and then print all elements using 2 different loops
		
		double[] num= {1, 2, 3, 4, 5};
		
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}
		
		System.out.println();
		//2nd way
		
		for(double number:num) {
			System.out.print(number+" ");
		}
		
		//Create an array on integers and calculate the sum of all elements in an array
		System.out.println();
		
		int[] nums= {24, 54, 3};
		System.out.print("Sum of all elements = ");
		System.out.println(nums[0]+nums[1]+nums[2]);
		
		System.out.println();
		//better way
		
		int sum=0;
		
		for(int i=0; i<nums.length; i++) {
			sum+=nums[i];		
		}
		
		System.out.println("Sum of all elements = "+sum);
		
		//2nd better way
		
		sum=0;
		
		for(int n:nums) {
			sum+=n;
			
		}
		
		System.out.println("sum of all elements = "+sum);
		
		}
	
	
	}


