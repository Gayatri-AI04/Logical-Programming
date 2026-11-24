package com.LogicExamples;

public class Factorial {

	public void m1() {
		int num = 5;
		int Facto = 1;
		
		for(int i = 1; i<=num; i++) {
			Facto = Facto * i;
			
		}
		System.out.println(Facto);
	}
	public static void main(String[] args) {
		Factorial f = new Factorial();
		f.m1();
	}
}
