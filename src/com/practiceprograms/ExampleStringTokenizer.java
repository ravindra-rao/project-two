package com.practiceprograms;

import java.util.StringTokenizer;

public class ExampleStringTokenizer {

	public static void main(String[] args) {
		//StringTokenizer class that tokenizes a string "java is a programming language" on the basis of whitespace.
		StringTokenizer testString1 = new StringTokenizer("java is a programming language"," ");
		System.out.println(testString1+"\n");
		while(testString1.hasMoreTokens()) {
			System.out.println(testString1.nextToken());
		}
		
		//In the below the tokens are not getting split by comma since there isnt a comma in the created string
		System.out.println();
		StringTokenizer testString2 = new StringTokenizer("java is a programming language",",");
		while(testString2.hasMoreTokens()) {
			System.out.println(testString2.nextToken());
		}
		
		StringTokenizer testString3 = new StringTokenizer("java,is,a,programming,language");
		System.out.println("\n"+testString3.nextToken(","));
		
		System.out.println("\n"+testString3.nextToken(" ")); //here its not getting split by space since there isnt any space present in the string
		
		//System.out.println("\n"+testString3.nextToken(",")); //NoSuchELementException if we give this here

	}

}
