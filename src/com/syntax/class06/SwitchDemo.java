package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {
		
		char choice='Y';
		String meaning;
		
		//variables and matching cases MUST BE of the same type
		//switch does not allow to have duplicate cases
		switch(choice) {
		
		case 'Y':
			meaning="Yes";
			break;
		case 'M':
			meaning="Maybe";
			break;
		case 'N':
			meaning="No";
			break;
		default:
			meaning="Uknown";
			break;			
		}
		System.out.println(meaning);
	}

}
