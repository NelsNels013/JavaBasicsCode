package com.syntax.class13;

public class StringDemo4 {

	public static void main(String[] args) {
		
		String str="fdjv,FVBFn544j5J^##*%@$B1J(*GG8uuhh";
		
		System.out.println(str.replaceAll("[0-9]", "#")); //fdjv,FVBFn###j#J^##*%@$B#J(*GG#uuhh			
		System.out.println(str.replaceAll("[a-z]", "#")); //####,FVBF#544#5J^##*%@$B1J(*GG8####
		System.out.println(str.replaceAll("[A-Z]", "#")); //fdjv,####n544j5#^##*%@$#1#(*##8uuhh
		System.out.println(str.replaceAll("[A-Za-z]", "#")); //####,#####544#5#^##*%@$#1#(*##8####
		System.out.println(str.replaceAll("[A-Za-z0-9]", "#")); //####,###########^##*%@$###(*#######
		System.out.println(str.replaceAll("[^a-z]", "_")); //fdjv_____n___j_________________uuhh
		
		System.out.println(str.replaceAll("[^A-Z]", "*")); //*****FVBF******J*******B*J**GG*****
		System.out.println(str.replaceAll("[^A-Za-z0-9]", "*")); //fdjv*FVBFn544j5J*******B1J**GG8uuhh
		str="abcdefghijkl";
		System.out.println(str.replaceAll("[a-f]", "*")); //******ghijkl
		str="fdjv,FVBFn544j5J^##*%@$B1J(*GG8uuhh";
		System.out.println(str.replaceAll("[A-Za-z0-9]", "")); //,^##*%@$(*

	}

}
