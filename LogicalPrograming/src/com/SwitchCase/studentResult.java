package com.SwitchCase;

public class studentResult {

	public static void main(String[] args) {
		
		studentDetails std = new studentDetails();
		std.setStuDetails();
		System.out.println(std.Cal_Percentage());
		System.out.println(std.Grade());
		
	}
}
