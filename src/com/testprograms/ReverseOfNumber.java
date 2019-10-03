package com.testprograms;
import java.util.Scanner;

class ReverseOfNumber {
	public static void main(String args[]) {		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number:");
		int number = s.nextInt();
		int reverseOfNumber = reverse(number);
		System.out.println("Reverse of the entered number:" + reverseOfNumber);
	}
	
	public static int reverse (int number) {
		int r, sum = 0;
		while (number > 0) {
			r = number % 10; // getting remainder
			sum = (sum * 10) + r;
			number = number / 10;
		}
		return sum;
	}
	

}