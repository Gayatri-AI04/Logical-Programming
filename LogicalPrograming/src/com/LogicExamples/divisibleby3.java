package com.LogicExamples;

public class divisibleby3 {

	public static void main(String[] args) {
		
		int a = -5;
		
		if(a%3==0 && a%5==0) {
			System.out.println("BIZZ_FIZZ");
			
		}
		
		else if(a%3==0) {
			System.out.println("BIZZ");
		}
		
		else if(a%5==0) {
			System.out.println("FIZZ");
		}
		
		else {
			System.out.println("Number is not divisible by both 3 & 5");
		}
	}
}
