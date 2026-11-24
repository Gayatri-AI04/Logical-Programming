package com.reverse;

public class ReverseNum {

	public void m1() {
		
		int i = 6798;
		int reverse = 0;
		
		while(i>=0) {
			int a =i % 10;
			reverse =(reverse * 10)+ a;
			i = i/10;
		
		}
		System.out.println(reverse);
	}
	
	public static void main(String[] args) {
		
		ReverseNum r = new ReverseNum();
		r.m1();
	}
}
