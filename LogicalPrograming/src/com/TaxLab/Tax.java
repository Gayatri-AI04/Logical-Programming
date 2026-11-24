package com.TaxLab;

import java.util.Scanner;

public class Tax {

	public void calculateTax() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Salary Here: ");
		double salary = sc.nextDouble();
		
		if(salary <=400000 && salary>0) {
			System.out.println("No Any Tax on this Salary");
		}
		
		else if(salary > 400000 && salary <= 800000) {
			double tax = (salary-400000)*0.05;
			System.out.println("You have to pay Tax of Rs."+tax);
		}
		
		else if(salary > 800000 && salary <= 1200000) {
			double tax1 = (salary-800000)*0.10+20000;
			System.out.println("You have to pay Tax of Rs."+tax1);
		}
		
		else if(salary > 1200000 && salary<= 1800000) {
			double tax2 = (salary - 1200000)*0.15+60000;
			System.out.println("You have to pay Tax of Rs."+tax2);
		}
			
		else if (salary > 1800000 && salary <= 2500000) {
			double tax3 = (salary- 1800000)*0.20+150000;
			System.out.println("You have to pay Tax of Rs."+tax3);
		}
		
		else if (salary > 2500000) {
			double tax4 = (salary- 2500000)*0.30+290000;
			System.out.println("You have to pay Tax of Rs."+tax4);
		}
		
		else {
			System.out.println("Invalid Input......!!!");
		}
	}
		
	public static void main(String[] args) {
		
		Tax t = new Tax();
		t.calculateTax();
	}
	
}
