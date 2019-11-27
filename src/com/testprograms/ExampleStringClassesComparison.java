package com.testprograms;

public class ExampleStringClassesComparison {
	public static void main(String[] args) {
		//Here we are doing performance test of different String classes
		long startTime = System.currentTimeMillis();
		concatWithString();
		System.out.println("Time taken by concatinating with String : "+(System.currentTimeMillis()-startTime));
		
		startTime = System.currentTimeMillis();
		concatWithStringBuffer();
		System.out.println("Time taken by concatinating with StringBuffer : "+(System.currentTimeMillis()-startTime));
		
		startTime = System.currentTimeMillis();
		concatWithStringBuilder();
		System.out.println("Time taken by concatinating with StringBuilder : "+(System.currentTimeMillis()-startTime));
		//We can observe that time taken for concatenation by String > StringBuffer
		//And StringBuffer ~= StringBuilder
		
		//String returns new hashcode value when you concat string but StringBuffer and StringBuilder returns same.
		hashcodeTest();
	}
	public static String concatWithString() {
		String test = "Java";
		for(int i=0; i<10000; i++) {
			test = test + "Tpoint";
		}
		return test;
	}
	public static String concatWithStringBuffer() {
		StringBuffer test = new StringBuffer("Java");
		for(int i=0; i<10000; i++) {
			test.append("Tpoint");
		}
		return test.toString();
	}
	public static String concatWithStringBuilder() {
		StringBuilder test = new StringBuilder("Java");
		for(int i=0; i<10000; i++) {
			test.append("Tpoint");
		}
		return test.toString();
	}
	public static void hashcodeTest() {
		System.out.println("\nHashcode test of a String : ");
		String test1 = "java";
		System.out.println(test1.hashCode());
		test1 = test1 + "point";
		System.out.println(test1.hashCode());
		
		System.out.println("\nHashcode test of a StringBuffer : ");
		StringBuffer test2 = new StringBuffer("Java");
		System.out.println(test2.hashCode());
		test2.append("point");
		System.out.println(test2.hashCode());
		
		System.out.println("\nHashcode test of a StringBuilder : ");
		StringBuilder test3 = new StringBuilder("Java");
		System.out.println(test3.hashCode());
		test3.append("point");
		System.out.println(test3.hashCode());
		
	}
	
}
