package com.syntax.class09;

public class Task {

	public static void main(String[] args) {
		
		
		//Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a 
		//grade B (use 2 different ways of creating an array).
		char[] grade=new char[6];		
		
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		
		
			System.out.println(grade[1]);
		
		
		
		//2nd way
		char[] grades= {'A', 'B', 'C', 'D'};
		
		System.out.println(grades[1]);
		
		
		//Create an array of words: Java, Saturday, day, coding, is. Print the following 
		//sentence using elements of array: “Saturday is Java coding Day”. 
		String[] word=new String[5];
		
		word[0]="Java";
		word[1]="Saturday";
		word[2]="day";
		word[3]="coding";
		word[4]="is";
		
		System.out.println(word[1]+" "+word[4]+" "+word[0]+" "+word[3]+" "+word[2]);
		
		//2nd way
		String[] words= {"Java", "Saturday", "day", "coding", "is"};
		
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
	}

}
