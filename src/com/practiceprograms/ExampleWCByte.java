package com.practiceprograms;

public class ExampleWCByte {

	public static void main(String[] args) {
		//byte b1 = 128; //Type mismatch : cannot convert from int to byte since range exceeds 127
		byte b1 = 127;
		Byte b2 = 10;
		byte b3 = 30;
		String s1 = "10";
		String s2 = "hello";
		
		//Converting String to byte
		System.out.println(Byte.parseByte(s1));
		//System.out.println(Byte.parseByte(s2)); //NumberFormatException
		
		//Converting String to Byte
		System.out.println("\n"+Byte.valueOf(s1));
		System.out.println(Byte.valueOf(s1).getClass());
		
		//Converting byte / Byte to String
		//byte / Byte to String
		System.out.println("\n"+Byte.toString(b2));
		System.out.println(Byte.toString(b2).getClass());
		System.out.println(String.valueOf(b2));
		System.out.println(String.valueOf(b2).getClass());
		//Only Byte to String
		System.out.println(b2.toString());
		System.out.println(b2.toString().getClass());
		
		//Converting Byte to byte
		System.out.println("\n"+b2.byteValue());
		
		//Converting Byte to other primitive Values
		//It returns the value of this Byte as a Short / Int Float etc
		System.out.println("\n"+b2.shortValue());
		System.out.println(b2.intValue());
		System.out.println(b2.longValue());
		System.out.println(b2.floatValue());
		System.out.println(b2.doubleValue());
		
		//Converting byte to Byte
		System.out.println("\n"+Byte.valueOf(b3));
		System.out.println(Byte.valueOf(b3).getClass());
	}

}
