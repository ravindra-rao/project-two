package com.karthik;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Q2 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two lines to process: ");
		String sLine1 = input.nextLine();
		String sLine2 = input.nextLine();
		System.out.println("The words that occur on both the lines are :" + commonWord(sLine1, sLine2));
		
	}
	
	public static String commonWord(String line1, String line2)
	{
		String sCommonWords = "";
		line1 = removeDuplicates(line1);
		line2 = removeDuplicates(line2);
		
		String[] wordsLine1 = line1.toLowerCase().split("\\W+");
		String[] wordsLine2 = line2.toLowerCase().split("\\W+");
			
			for (String wordInSecondLine : wordsLine2)
			{
				for (String wordInFirstLine : wordsLine1)
				{
					if (wordInSecondLine.equals(wordInFirstLine))
					{
						sCommonWords = sCommonWords.concat("\n").concat(wordInSecondLine);
						break;
					}
				}
			}
		return sCommonWords;
	}
	public static String removeDuplicates(String myString) {
		//splits the strings based on delimiter " " and converts it into an array
		//then removes the duplicate words in the string
		//then joins the array elements back to form a string
        return Arrays.asList(myString.split(" "))
                     .stream()
                     .distinct()
                     .collect(Collectors.joining(" "));
    }

}
