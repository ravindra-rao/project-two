package com.testprograms;

public class MiscLearnings {

	public static void main(String[] args) {
		labelledForLoop();
		mainMethodCallFromAnotherProgram();
	}

	public static void labelledForLoop() {
		loopOne: for (int i = 1; i <= 3; i++) {
			loopTwo: for (int j = 1; j <= 3; j++) {
				if (i == j)
					continue loopTwo;
				else
					System.out.println(i + " " + j);
			}
		}
	}

	public static void mainMethodCallFromAnotherProgram() {

		/*
		 * Main Method Is Just a Regular Method You can call a regular method by passing
		 * actual parameters Can you pass arguments to main? Of course, yes For example,
		 * the main method in class Calc is invoked by main method in class
		 * LabelledForLoop as shown below
		 */
		System.out.println("\nCalculator output : ");
		Calc.main(new String[] { "1+1" });
	}

}
