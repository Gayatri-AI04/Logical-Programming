package com.Pattern;

public class HallowStarPattern {
	
	public static void main(String[] args) {
		
	
	for(int i =1; i<=3; i++) {
		for (int k = 1; k<=3; k++) {
			if(i==1 || i==3 || k==1 || k==3) {
				
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
			
		}
		System.out.println();
}
}
}

