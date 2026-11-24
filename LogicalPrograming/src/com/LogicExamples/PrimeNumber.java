package com.LogicExamples;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num = 2;
		boolean isPrime = true;
		
		if(num<=1) {
			System.out.println("Not Prime Number");
		}
		else {
			for(int i = 2; i<num; i++) {
				if(num%i==0) {
					isPrime = false;
				}
			}
		}
		if(isPrime) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not a Prime number");
		}
	}
}


