package com.syntax.class11;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String []  state= new String [] {"virginia", "texas", "california", "texas", "virginia"};
        System.out.println("Duplicate elements in given array of strings ");
         
        for(int i = 0; i < state.length; i++) {
            for(int j = i + 1; j < state.length; j++) {
                if(state[i] == state[j])
                    System.out.println(state[j]);
            }

	}
	}

}
