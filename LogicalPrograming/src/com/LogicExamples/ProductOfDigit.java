package com.LogicExamples;

public class ProductOfDigit {

	public void m1() {
		
		int num = 89789;
		int Product = 1;
		
		while(num>0) {
			
			int tem = num%10;
			Product = Product*tem;
			num = num/10;

		}
		System.out.println(Product);
	}
	public static void main(String[] args) {
		ProductOfDigit pd = new ProductOfDigit();
		pd.m1();
	}
}
