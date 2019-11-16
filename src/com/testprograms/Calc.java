package com.testprograms;

import java.util.Scanner;

public class Calc {
	public static String[] sDelimiters = { "+", "-", "*", "/", "%" };
	public static String sEnteredDelimiter = "";
	public static String[] sNumbers;
	public static int iNum1, iNum2;

	public static void main(String[] args) {
		// To run it from console, fetch the input from getInput() method
		// parseInput(getInput());
		// To fetch the input from command line directly as arguments to the program's
		// main method, use the below
		// In commnand line, we will have to run java Calc.java 2*12 etc
		parseInput(args[0]);

		// To get input from console, do the below :
		//parseInput(getInput());

		int result = performOperation();
		System.out.println(result);

	}

	public static String getInput() {
//		System.out.println("Enter operand1*operator*operand2");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		scanner.close();
		return input;
	}

	public static void parseInput(String input) {
		for (String sDelimiter : sDelimiters) {
			if (input.contains(sDelimiter))
				sEnteredDelimiter = sDelimiter;
		}

		sNumbers = input.split("\\" + sEnteredDelimiter);
		iNum1 = Integer.parseInt(sNumbers[0]);
		iNum2 = Integer.parseInt(sNumbers[1]);
	}

	public static int performOperation() {
		int result = 0;
		switch (sEnteredDelimiter) {
		case "+":
			result = sum(iNum1, iNum2);
			break;
		case "-":
			result = difference(iNum1, iNum2);
			break;
		case "*":
			result = product(iNum1, iNum2);
			break;
		case "/":
			result = dividend(iNum1, iNum2);
			break;
		case "%":
			result = remainder(iNum1, iNum2);
			break;
		default:
			System.out.println("Invalid operator entered");
		}
		return result;

	}

	public static int sum(int iNum1, int iNum2) {
		return iNum1 + iNum2;
	}

	public static int difference(int iNum1, int iNum2) {
		return iNum1 - iNum2;
	}

	public static int product(int iNum1, int iNum2) {
		return iNum1 * iNum2;
	}

	public static int dividend(int iNum1, int iNum2) {
		return iNum1 / iNum2;
	}

	public static int remainder(int iNum1, int iNum2) {
		return iNum1 % iNum2;
	}

}
