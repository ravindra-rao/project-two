package com.practiceprograms;

public class ExampleWCBoolean {

	public static void main(String[] args) {
		Boolean b1 = true;
		Boolean b2 = false;
		Boolean b4 = b1;
		System.out.println(b1); //true
		System.out.println(b2); //false
		System.out.println(b4); //true
		System.out.println("Value of boolean objects "+"b1 : "+b1+" b2 : "+b2);
		String s = "10";
		
		//booleanValue
		boolean b3 = b1.booleanValue(); //Returns a Boolean primitive for the value of this Boolean object.
		System.out.println(b3); //true
		
		//compare
		int iComparison = Boolean.compare(b1, b2);
		System.out.println("\n"+iComparison); //
		if(iComparison>0) System.out.println("b1 is true");
		else System.out.println("b2 is true");
		
		//logicalAnd
		//Returns the result of implementing logical AND operation on the assigned boolean operands.
		System.out.println("\n"+Boolean.logicalAnd(b1, b2));
		
		//parseBoolean
		//converting string to boolean
		//Parses the string argument as a Boolean
		System.out.println(Boolean.parseBoolean("true"));
		System.out.println(Boolean.parseBoolean("false"));
		System.out.println(Boolean.parseBoolean("hi"));
		
		//toString
		//converting boolean to string
		//b1.toString() = Boolean.toString(b1) = String.valueOf(b1)
		System.out.println("\ntostring :");
		System.out.println(b1.toString()); //non static method
		System.out.println(b1.toString().getClass());
		System.out.println(Boolean.toString(b1)); //static method and does the same as b1.toString()
		System.out.println(Boolean.toString(b1).getClass()); 
		System.out.println(String.valueOf(b1)); //does the same ad above two
		System.out.println(String.valueOf(b1).getClass());
		
		//hashCode
		System.out.println("\n"+b1.hashCode());
		
		//valueOf
		System.out.println("\n"+Boolean.valueOf(b1));
		
		

	}

}
