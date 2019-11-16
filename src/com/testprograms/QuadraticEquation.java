package com.testprograms;

import java.util.*;

public class QuadraticEquation {

	/**
	 * @param args the command line arguments
	 */
	// program to calculate the wuadratic eqautions and its roots
	public static void main(String[] args) {
		// TODO code application logic here
		Scanner sc = new Scanner(System.in);
		double a, b, c, Disc, r1, r2;
		String ch;
		int iNumber = 0;
		while (true) {
			System.out.println("Enter the coefficient of x^2 = ");
			A: {
				a = sc.nextDouble();
				System.out.println("Enter the coefficient of x = ");
				b = sc.nextDouble();
				System.out.println("Enter the constant value = ");
				c = sc.nextDouble();

				Disc = ((b * b) - (4 * a * c));
				if (Disc > 0) {
					r1 = (-b) - ((Math.pow(Disc, 0.5))) / (2.0 * a);
					r2 = (-b) + ((Math.pow(Disc, 0.5))) / (2.0 * a);
					System.out.println(
							"The roots are real and unequal" + " " + "And the roots are = " + r1 + " and " + r2);
				} else if (Disc == 0) {
					r1 = (-b) / (2.0 * a);
					System.out.println("The roots are real and equal" + "And the roots are = " + r1);

				} else {
					System.out.println("The roots are imaginary");
				}
				break A;
			}

			System.out.println("Want to enter more y/n");
			ch = sc.next();
			if (ch.equals("n"))	break;
			iNumber++; /// having an error here only in the net beans... saying unreachable
					/// statement.....
		}
	}
}
