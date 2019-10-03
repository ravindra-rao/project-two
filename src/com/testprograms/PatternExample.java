package com.testprograms;
import java.util.Scanner;

public class PatternExample {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number:");
		int val = s.nextInt();

		for (int i = 1; i <= val; i++) {
			for (int j = 1; j <= val - i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(k);
			}
			System.out.println("");
		}

	}

}