package com.reverse;

public class Pelindrome {

	public void m1() {
		
		int num = 6776;
		int reverse = 0;
		int original = num;
		
		
		while (num > 0) {
			int i =num%10;
			reverse = reverse *10 +i;
			num = num/10;
		}
			
			if(reverse == original) {
				System.out.println("Number is pelindrome");
			}
			else{
				System.out.println("Number is not Pelindrome");
			}
		
	}
	public static void main(String[] args) {
		Pelindrome p = new Pelindrome();
		p.m1();
	}
}
