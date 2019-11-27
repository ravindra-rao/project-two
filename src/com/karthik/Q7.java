package com.karthik;

import java.util.Scanner;

public class Q7 {
	public static int iLetterA, iLetterE, iLetterI, iLetterO, iLetterU, iLetterNonVowel;
	public static void main(String[] args) {
		String sInput = inputFetcher();
		
		vowelCounter(sInput);
		display();

	}
	public static String inputFetcher() {
		System.out.println("Please enter a line of input to be analyzed ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
		
	}
	public static void vowelCounter(String sInput) {
		String sInputLowerCase = sInput.toLowerCase();
		char[] chars = sInputLowerCase.toCharArray();
		for(char element : chars) {
			switch(element) {
			case 'a' :
				iLetterA++;
				break;
			case 'e' :
				iLetterE++;
				break;
			case 'i' :
				iLetterI++;
				break;
			case 'o' :
				iLetterO++;
				break;
			case 'u' :
				iLetterU++;
				break;
			default :
				iLetterNonVowel++;
				break;
			}
		}
	}
	public static void display() {
		System.out.println("Vowel occurance report:");
		String output = 
				"a : "   + iLetterA + 
				"\ne : " + iLetterE + 
				"\ni : " + iLetterI + 
				"\no : " + iLetterO + 
				"\nu : " + iLetterU;
		System.out.println(output);
	}

}
