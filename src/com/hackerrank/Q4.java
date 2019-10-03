package com.hackerrank;
import java.util.Scanner;

/**
 * @author RAVI
 * This class is the solution for Q4 : Java Stdin and Stdout 2 in hackerrank exercise
 *
 */
public class Q4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
		/*
		 * If you use the nextLine() method immediately following the nextInt() method,
		 * recall that nextInt() reads integer tokens; because of this, the last newline
		 * character for that line of integer input is still queued in the input buffer
		 * and the next nextLine() will be reading the remainder of the integer line
		 * (which is empty).
		 * Thus, using the scan.nextLine() above is getting us rid of the pesky newline character
		 */       
        String s = scan.nextLine();
        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

	}

}
