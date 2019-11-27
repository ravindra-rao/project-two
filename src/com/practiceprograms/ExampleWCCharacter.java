package com.practiceprograms;

public class ExampleWCCharacter {

	public static void main(String[] args) {
		char c1 = 'a';
		Character c2 = 'b';
		Character c3 = '1';
		Character c4 = '@';
		String s1 = "hello";
		int i1=100;
		
		//Converting String to char
		//If your string contains exactly one character the simplest way to convert it to a character is probably to call the charAt method:
		System.out.println("\n"+s1.charAt(0));
		
		//Converting String to Character
		System.out.println("\n"+Character.valueOf(s1.charAt(0)));
		System.out.println(Character.valueOf(s1.charAt(0)).getClass());
		
		//Converting char / Character to String
		//char / Character to String
		System.out.println(Character.toString(c2));
		System.out.println(Character.toString(c2).getClass());
		System.out.println(String.valueOf(c1));
		System.out.println(String.valueOf(c2).getClass()); //all three above converts character to string
		//Only Character to String
		System.out.println(c2.toString());
		System.out.println(c2.toString().getClass());
		
		//Converting Character to char
		System.out.println("\n"+c2.charValue());
		
		//Converting char to Character
		System.out.println(Character.valueOf(c1));
		System.out.println(Character.valueOf(c1).getClass());
		
		//toUpperCase
		System.out.println("\n"+Character.toUpperCase(c1));
		System.out.println(Character.toUpperCase(c2));
		
		//isDigit
		System.out.println("\n"+Character.isDigit(s1.charAt(0)));
		
		//getType
		//Returns the value which indicates the general category of the character.
		System.out.println(Character.getType(c1));
		System.out.println(Character.getType(c2));
		
		//toChars
		//Converts the specified character(Unicode code point) into its UTF-16 representation which is stored in a char array.
		System.out.println(Character.toChars(i1));
		
		//hashCode
		System.out.println("\n"+c2.hashCode());
		

	}

}
