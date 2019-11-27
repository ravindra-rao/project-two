package com.karthik;

public class MethodOverloadingExample {

	public static void main(String[] args) {
		int iNum1=10, iNum2=20, iNum3=30;
		double dNum1=10, dNum2=20;
		sum(iNum1,iNum2);
		sum(iNum1,iNum2, iNum3);
		sum(dNum1,dNum2);

	}
	public static int sum(int num1, int num2) { 
		int sum = num1 + num2;
		System.out.println(sum);
		return sum;
	}
	public static void sum(int num1, int num2, int num3) { //changing number of args
		int sum = num1 + num2 +num3;
		System.out.println(sum);
	}
	public static void sum(double num1, double num2) { //changing datatype of args
		double sum = num1 + num2;
		System.out.println(sum);
	}
}


