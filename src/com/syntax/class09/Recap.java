package com.syntax.class09;

public class Recap {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			
			System.out.println("Hello"); //5
			
			for(int y=1; y>=3; y++) {
				
				System.out.println("Bye"); //0
			}
			
			
		}
		
		System.out.println("------------------------------------------");

     /*
		for(int i=1; i<=5; i++) {
			
			System.out.println("Hello"); //1
			
			for(int y=1; y<=3; y--) {
				
				System.out.println("Bye"); //infinite
			}
			
			
		}
		*/
       
       System.out.println("--------------------------------------------");
		
       for(int i=1; i<=5; i++) {
			
			System.out.println("Hello"); //5
			
			for(int y=1; y<=3; y++) {
				
				System.out.println("Bye"); //3
			}
			
			break;
			
		}
       
       System.out.println("---------------------------------------------");
       
       for(int i=1; i<=5; i++) {
			
			System.out.println("Hello " +i); //5
			
			for(int y=1; y<=3; y++) {
				
				System.out.println("Bye   " +y); //1
				
				break;
			}
			
		}
       
       System.out.println("----------------------------------------------");
       
       for(int i=1; i<=5; i++) {
			
			System.out.println("Hello"); //5
			
			for(int y=1; y>=3; y++) {
				
				continue;
				
				//System.out.println("Bye"); //unreachable code because of continue;
			}
			
			
		}
	}

}
