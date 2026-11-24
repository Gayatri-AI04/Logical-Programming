package com.Pattern;

public class CharacterSameRows {

	public static void main(String[] args) {
		for(char c = 'A'; c<= 'D'; c++) {
			for(int i =1; i<=4; i++) {
				System.out.print(c);
			}
			System.out.println();
		}
		
	}
}
