package com.testprograms;
import java.util.Scanner;

class Palindrome {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number:");
		int number = s.nextInt();
		int reverseOfNumber = reverse(number);
		System.out.println("Reverse of the entered number:" + reverseOfNumber);
	}

	public static int reverse(int number) {
		int r, sum = 0, temp;
		temp = number;
		while (number > 0) {
			r = number % 10; // getting remainder
			sum = (sum * 10) + r;
			number = number / 10;
		}
		isPalindrome(sum, temp);
		return sum;
	}

	public static void isPalindrome(int sum, int temp) {
		if (sum == temp)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");
	}
}