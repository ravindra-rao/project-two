package com.hackerrank;

import java.util.Scanner;

/**
 * @author RAVI
 * This class is solution to hackerrank java Q2 : Java Stdin and Stdout 1
 */
public class Q2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your name");
		String sName = scanner.next();
		System.out.println("Please enter your roll number");
		int iRollNo = scanner.nextInt();
		System.out.println(sName);
		System.out.println(iRollNo);

	}

}
