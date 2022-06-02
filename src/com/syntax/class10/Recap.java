package com.syntax.class10;

public class Recap {

	public static void main(String[] args) {
		
		String[] disney= {"Elsa", "Shrek", "Goofy", "Mulan"};
		
		
		
		//to get all elements from array
		
		for(int i=0; i<disney.length; i++) {
			
			
			if(disney[i].equalsIgnoreCase("Shrek")) {
				System.out.println(disney[i]+" is my favorite character");
			}else {
				System.out.println(disney[i]);
			}
		}
		
		System.out.println();
		
		for(String dis:disney) {
			
			if(dis.equalsIgnoreCase("Shrek")) {
				continue;
			}else {
				System.out.println(dis+" ");
			}
		}

	}

}
