package com.LogicExamples;

public class PerfectNumber {
 
	public void m1() {
		int num = 8128;
		int sum = 0;
		
		for(int i = 1; i<=num/2; i++) {
			if(num%i==0) {
				sum = sum+i;
			}	
		}
		if (num == sum) {
			System.out.println(num+" "+"is a Perfect number");
		}else {
		System.out.println(num+" "+"is not a perfect num");
		}
	}
	public static void main(String[] args) {
		PerfectNumber p = new PerfectNumber();
		p.m1();
	}
}
