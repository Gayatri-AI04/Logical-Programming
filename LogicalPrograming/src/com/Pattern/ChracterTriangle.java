package com.Pattern;

public class ChracterTriangle {

	public static void main(String[] args) {
		
		for(int i =1; i<=4; i++) {
			char c = 'A';
			for(char j = 1; j<=i; j++) {
				System.out.print(c);
				c++;
				
			}
			System.out.println();
			
		}
	}
}
