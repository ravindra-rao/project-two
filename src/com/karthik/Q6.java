package com.karthik;

import java.util.Scanner;

public class Q6 {
	public static int iCorrectQuestions, iWrongQuestions;
	public static final String display = "Main Menu\n" + "1: Addition\n" + "2: Subtraction\n" + "3: Multiplication\n"
			+ "4: Division\n" + "5: Exit\n" + "Enter a choice : ";

	public static void main(String[] args) {
		display();
	}

	public static void display() {
		Scanner scanner = new Scanner(System.in);
		int input = 0;

		while (true) {
			if (input < 0 || input > 5) {
				System.out.println("Invalid Input");
				break;
			} else if (input == 5) {
				System.out.println("Thank you for playing");
				break;
			} else {
				System.out.println("\n" + display);
				input = scanner.nextInt();
				int iNumber1 = (int) (1 + (Math.random() * 100));
				int iNumber2 = (int) (1 + (Math.random() * 100));
				int iBig, iSmall;
				if (iNumber1 > iNumber2) {
					iBig = iNumber1;
					iSmall = iNumber2;
				} else {
					iBig = iNumber2;
					iSmall = iNumber1;
				}

				switch (input) {
				case 1:
					// addition
					System.out.println("What is " + iBig + " + " + iSmall + "?");
					int iUserAnswer = scanner.nextInt();
					int iAnswer = sum(iBig, iSmall);
					if (iAnswer == iUserAnswer) {
						System.out.println("Correct");
						iCorrectQuestions++;
					} else {
						System.out.println("Wrong");
						iWrongQuestions++;
					}
					break;
				case 2:
					// subtraction
					System.out.println("What is " + iBig + " - " + iSmall + "?");
					iUserAnswer = scanner.nextInt();
					iAnswer = difference(iBig, iSmall);
					if (iAnswer == iUserAnswer) {
						System.out.println("Correct");
						iCorrectQuestions++;
					} else {
						System.out.println("Wrong");
						iWrongQuestions++;
					}
					break;
				case 3:
					// multiplication
					System.out.println("What is " + iBig + " * " + iSmall + "?");
					iUserAnswer = scanner.nextInt();
					iAnswer = product(iBig, iSmall);
					if (iAnswer == iUserAnswer) {
						System.out.println("Correct");
						iCorrectQuestions++;
					} else {
						System.out.println("Wrong");
						iWrongQuestions++;
					}
					break;
				case 4:
					// division
					System.out.println("What is " + iBig + " / " + iSmall + "?");
					iUserAnswer = scanner.nextInt();
					iAnswer = dividend(iBig, iSmall);
					if (iAnswer == iUserAnswer) {
						System.out.println("Correct");
						iCorrectQuestions++;
					} else {
						System.out.println("Wrong");
						iWrongQuestions++;
					}
					break;
				default:
					break;
				}
			}

		}
		System.out.println("You got " + iCorrectQuestions + " questions right");
		System.out.println("You got " + iWrongQuestions + " questions wrong");
	}

	public static int sum(int num1, int num2) {
		return num1 + num2;
	}

	public static int difference(int num1, int num2) {
		return num1 - num2;
	}

	public static int product(int num1, int num2) {
		return num1 * num2;
	}

	public static int dividend(int num1, int num2) {
		return num1 / num2;
	}

}
