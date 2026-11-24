package com.LogicExamples;

import java.util.Scanner;

public class NumberRange {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number is between range 1 to 100");
		int num = s.nextInt();
		
		
	//int num = 78;
	
	if(num >=1 & num <= 100) {
		System.out.println("the number is between range 1 to 100");
	}
	
	else {
		System.out.println("number is not between range 1 to 100");
	}
}
}