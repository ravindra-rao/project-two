package com.testprograms;

public class ExampleWCInteger {

	public static void main(String[] args) {
		Integer i1 = new Integer(10); //Deprecated
		Integer i2 = Integer.valueOf(20); //The static factory valueOf(int) is generally a better choice, as it islikely to yield significantly better space and time performance than the constructor Integer(int)
		Integer i3 = 30;
		int i4 = 40;
		String s1 = "40";
		
		//Converting String to int
		System.out.println("\n"+Integer.parseInt(s1));
		
		//Converting String to Integer
		System.out.println("\n"+Integer.valueOf(s1));
		System.out.println(Integer.valueOf(s1).getClass());
		
		//Converting int / Integer to String
		//int / Integer to String
		System.out.println(Integer.toString(i4));
		System.out.println(Integer.toString(i3).getClass());
		System.out.println(String.valueOf(i3));
		System.out.println(String.valueOf(i3).getClass());
		//Only Integer to String
		System.out.println("\n"+i2.toString());
		System.out.println(i2.toString().getClass());
		
		//Converting Integer to int
		//Returns the value of the Integer as a primitive type int
		System.out.println(i1.intValue());
		
		//Converting int to Integer
		System.out.println(Integer.valueOf(i4));
		System.out.println(Integer.valueOf(i4).getClass());
		
	}

}
