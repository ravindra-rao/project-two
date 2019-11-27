package com.karthik;
import java.util.Scanner;


public class Q4 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a line of input to process : ");
		String sInput = input.nextLine();
		System.out.println(swapCase(sInput));
	}
	
	public static String swapCase(String sInput)
	{
		String sInputReverse = new String();
		
		char[] letters = sInput.toCharArray();
		for(char letter : letters) {
			if(Character.isUpperCase(letter)) {
				letter = Character.toLowerCase(letter);
				sInputReverse = sInputReverse + letter;
			}
			else{
				letter = Character.toUpperCase(letter);
				sInputReverse = sInputReverse + letter;
			}
		}
		return sInputReverse;
	}
	
}
