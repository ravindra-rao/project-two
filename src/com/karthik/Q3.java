package com.karthik;

import java.util.Scanner;

public class Q3 {
	public static final String sCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final String sNumbers = "22233344455566677778889999";

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What letter on the international telephone dialpad would you like to press : ");
		String sLetter = input.next();
		char cLetter = sLetter.toUpperCase().charAt(0);
		if (sLetter.isBlank() || sLetter.length() > 1) {
			System.out.println("Invalid Input. You entered multiple letters. Please enter a single letter");
		} else if (!Character.isLetterOrDigit(cLetter)) {
			System.out.println("Invalid Input. You entered a special character. Please enter a single letter");
		} else if (Character.isDigit(cLetter)) {
			System.out.println("Invalid Input. You entered a number. Please enter a single letter");
		} else {
			System.out.println("You pressed the digit : " + numberFinder(cLetter));
		}

	}

	public static String numberFinder(char cChar) {
		String sNumber = new String();

		for (int i = 0; i < sCharacters.length(); i++) {
			if (sCharacters.charAt(i) == cChar) {
				sNumber = Character.toString(sNumbers.charAt(i));
				// Character entered is matched with the number according to international
				// dialpad
			}
		}

		return sNumber;
	}

}
