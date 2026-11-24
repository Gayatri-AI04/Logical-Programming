package com.SwitchCase;

import java.util.Scanner;

public class studentDetails {
	
	Scanner sc = new Scanner(System.in);
	static Student s1 = new Student();

	public void setStuDetails()
	{
	
	System.out.println("Enter Your Name here: ");
	
	String Name = sc.next();
	s1.name=Name;
		System.out.println(s1.name);

	
	System.out.println("Enter youe Maths MArks: ");
	double mathMarks = sc.nextDouble();
	s1.Math = mathMarks;
	System.out.println(s1.Math);
	
	System.out.println("Enter your Science Marks: ");
	double sciMarks = sc.nextDouble();
	s1.Science = sciMarks;
	System.out.println(s1.Science);
	
	System.out.println("Enter your Physics Marks: ");
	double phyMarks = sc.nextDouble();
	s1.Physics = phyMarks;
	System.out.println(s1.Physics);
	
	System.out.println("Enter your Chemistry Marks: ");
	double chemMarks = sc.nextDouble();
	s1.Chemistry = chemMarks;
	System.out.println(s1.Chemistry);
//	
	}
	
	public double Cal_Percentage() {
		System.out.println("cal method");

		double p= ((s1.Math+s1.Science+s1.Physics+s1.Chemistry)/400)*100;
		
		return p;
		
	}
	
	public char Grade()
	{
		double a = Cal_Percentage();
		if(a>=90 && a<=100) {
			return 'A';
		}
		
		else if(a>80 && a<90) {
			return 'B';
		}
		
		else if(a>=60 && a<80) {
			return 'C';
		}
		
		else if(a>=40 && a<60) {
			return 'D';
		}
		
		else {
			
			System.out.println("You Are Fail.....");
			return 'F';
		}
		
		
	}
	
}
	

