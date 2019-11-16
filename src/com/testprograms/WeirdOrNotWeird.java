package com.testprograms;
import java.util.Scanner;

public class WeirdOrNotWeird {

	public static void main(String[] args) {
		System.out.println("Please enter a number from 1 to 100");
		Scanner scanner = new Scanner(System.in);
		int iNumber = scanner.nextInt();

		if (iNumber < 1 || iNumber > 100) {
			System.out.println("Invalid input. Please Enter number betweeb 1 and 100");
		} 
		else { //0<iNumber<100
			if (iNumber % 2 != 0) {
				System.out.println("Weird"); // iNumber is odd
			} 
			else { // even number
				if (2 <= iNumber && iNumber <= 5) { // even number between 2 and 5
					System.out.println("Not Weird");
				} else if (6 <= iNumber && iNumber <= 20) {
					System.out.println("Weird");
				} else if (iNumber > 20) {
					System.out.println("Not Weird");
				}
			}
		}
		scanner.close(); //closing scanner after its usage

	}

}
