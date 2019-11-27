package com.karthik;
import java.util.Scanner;

public class Q11 {
	public static void main(String[] args) {
		int iIntegerVal;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer : ");
		iIntegerVal = input.nextInt();

		if ((iIntegerVal % 5 == 0) && (iIntegerVal % 6 == 0)) {
			System.out.println(iIntegerVal + " is divisible by both 5 and 6.");
		} else {
			System.out.println(iIntegerVal + " is not divisible by both 5 and 6.");
		}

		if ((iIntegerVal % 5 == 0) || (iIntegerVal % 6 == 0)) {
			System.out.println(iIntegerVal + " is divisible by one of 5 and 6.");
		} else {
			System.out.println(iIntegerVal + " is not divisible by one of 5 and 6.");
		}
	}
}