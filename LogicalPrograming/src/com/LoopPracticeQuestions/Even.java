package com.LoopPracticeQuestions;

public class Even {

	public void m1() {
		int i;
		for(i=1; i%2==0; i++ ) {
			if(i == 50) {
				break;
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		Even e = new Even();
		e.m1();
	}
}
