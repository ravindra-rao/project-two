package com.practiceprograms;

import java.util.Date;

public class ExampleString {
	public static int i1 = 10;
	public static Integer i2 = new Integer(100);
	
	public static double d1 = 10.243;
	public static Double d2 = new Double(100.243);
	
	public static char c1 = 'A';
	public static Character c2 = new Character('J');
	public static char[] c3 = {'J','a','v','a'};
	
	public static String s1 = new String("ABC");
	/*
	 * When creating string using "new" keyword : 
	 * 		A string object ABC will be created in SCP (1 object)
	 *      Another string object ABC will be created in the Heap memory too (1 object) 
	 *      The variable s1 will refer to the ABC in the Heap Memory
	 *      Thus, total (1 object) + (1 object) = (2 objects) will be created
	 */
	public static String s2 = new String("ABC");
	/*
	 * Now with this, another string object ABC will be created in the Heap Memory (1 object)
	 * But this will not create another object in SCP
	 * Thus, total (1 object) will be created
	 */
	public static String s3 = "ABC";
	/*
	 * Now with this, no object will be created in the heap memory 
	 * And also since ABC is already existing in SCP, it will not create another object in SCP 
	 * Only the variable s3 will refer to the existing string object ABC in SCP 
	 * Thus, no objects are created
	 */
	public static String s4 = "ABC";
	/*
	 * Now with this too, no object will be created in the heap memory 
	 * And also since ABC is already existing in SCP, it will not create another object in SCP 
	 * Only the variable s4 will refer to the existing string object ABC in SCP 
	 * Thus, no objects are created
	 */
	public static String s5 = "BCD";
	/*
	 * Now with this, no object will be created in the heap memory 
	 * And since BCD is not already existing in SCP, it will create an object in SCP 
	 * Only the variable s5 will refer to the string object BCD in SCP 
	 * Thus, total (1 object) will be created
	 */
	
	public static String s6 = "sachin";
	public static String s7 = "SACHIN";
	public static String s8 = "sACHin";
	public static String s9 = "    sACHin      ";
	public static String s10 = "    sACHin      tenDulKar   ";
	public static String s11 ="Java is a programming language. Java is a platform. Java is an Island.";
	
	public static int rollNo;
	public static String name;
	public static double marks;
	
	public ExampleString() {
		// TODO Auto-generated constructor stub
	}
	
	public ExampleString(int rollno, String name, double marks) {
		this.rollNo = rollno;
		this.name = name;
		this.marks = marks;
	}
	public static String reverseCase(String text)
	{
	    char[] chars = text.toCharArray();
	    for (int i = 0; i < chars.length; i++)
	    {
	        char c = chars[i];
	        if (Character.isUpperCase(c))
	        {
	            chars[i] = Character.toLowerCase(c);
	        }
	        else if (Character.isLowerCase(c))
	        {
	            chars[i] = Character.toUpperCase(c);
	        }
	    }
	    return new String(chars);
	}
	public static void testStringComparisonByEqualsOperator() {
		//==operator will compare the references and not the actual values of the string objects
		System.out.println("s1==s2 : "+(s1==s2)); 
		/*
		 * false 
		 * because the variables s1 and s2 are referring to different objects ABC in heap memory
		 */
		System.out.println("s1==s3 : "+(s1==s3)); 
		/*
		 * false 
		 * because the variables s1 refers to string object ABC in heap memory 
		 * s3 refers to string object ABC in SCP
		 */
		System.out.println("s1==s4 : "+(s1==s4)); 
		/* false 
		 * because the variables s1 refers to string object ABC in heap memory 
		 * s4 refers to string object ABC in SCP
		 */
		System.out.println("s1==s5 : "+(s1==s5)); 
		/* false 
		 * because the variables s1 refers to string object ABC in heap memory 
		 * s5 refers to string object BCD in SCP
		 */
		System.out.println("s2==s3 : "+(s2==s3)); 
		/* false 
		 * because the variables s2 refers to string object ABC in heap memory 
		 * s3 refers to string object ABC in SCP
		 */
		System.out.println("s2==s4 : "+(s2==s4)); 
		/* false 
		 * because the variables s2 refers to string object ABC in heap memory 
		 * s4 refers to string object ABC in SCP
		 */
		System.out.println("s2==s5 : "+(s2==s5)); 
		/* false 
		 * because the variables s2 refers to string object ABC in heap memory 
		 * s5 refers to string object BCD in SCP
		 */
		System.out.println("s3==s4 : "+(s3==s4)); 
		/* true 
		 * because the variables s3 and s4 refers to the same string object ABC in SCP
		 */
		System.out.println("s3==s5 : "+(s3==s5)); 
		/* false 
		 * because the variables s3 refers to string object ABC in SCP
		 * s5 refers to string object BCD in SCP
		 */
		System.out.println("s4==s5 : "+(s4==s5)); 
		/* false 
		 * because the variables s4 refers to string object ABC in SCP
		 * s5 refers to string object BCD in SCP
		 */
		System.out.println();
	}
	public static void testStringComparisonByEqualsMethod() {
		//.equals() operator will compare the references and not the actual values of the string objects
		System.out.println("s1.equals(s2) : "+(s1.equals(s2))); 
		/*
		 * true 
		 * because the variables s1 and s2 are having same values ABC
		 */
		System.out.println("s1.equals(s3) : "+(s1.equals(s3))); 
		/*
		 * true 
		 * because the variables s1 and s3 are having same values ABC
		 */
		System.out.println("s1.equals(s4) : "+(s1.equals(s4))); 
		/*
		 * true 
		 * because the variables s1 and s4 are having same values ABC
		 */
		System.out.println("s1.equals(s5) : "+(s1.equals(s5))); 
		/*
		 * false 
		 * because the variables s1 has the value ABC and s5 has the value BCD
		 */
		System.out.println("s2.equals(s3) : "+(s2.equals(s3))); 
		/*
		 * true 
		 * because the variables s2 and s3 are having same values ABC
		 */
		System.out.println("s2.equals(s4) : "+(s2.equals(s4))); 
		/*
		 * true 
		 * because the variables s2 and s4 are having same values ABC
		 */
		System.out.println("s2.equals(s5) : "+(s2.equals(s5))); 
		/*
		 * false 
		 * because the variables s2 has the value ABC and s5 has the value BCD
		 */
		System.out.println("s3.equals(s4) : "+(s3.equals(s4)));  
		/* true 
		 * because the variables s3 and s4 refers to the same string object ABC in SCP
		 */
		System.out.println("s3.equals(s5) : "+(s3.equals(s5)));  
		/*
		 * false 
		 * because the variables s3 has the value ABC and s5 has the value BCD
		 */
		System.out.println("s4.equals(s5) : "+(s4.equals(s5)));  
		/*
		 * false 
		 * because the variables s4 has the value ABC and s5 has the value BCD
		 */
		System.out.println("s6.equals(s7) : "+(s6.equals(s7)));  
		/*
		 * false 
		 * because the variables s6 has the value sachin and s7 has the value SACHIN
		 */
		System.out.println("s6.equalsIgnoreCase(s7) : "+(s6.equalsIgnoreCase(s7)));  
		/*
		 * false 
		 * because the variables s6 has the value sachin and s7 has the value SACHIN
		 */
	}
	public static void testStringComparisonByCompareToMethod() {
		/*
		 * The String compareTo() method compares values lexicographically and returns an integer value 
		 * The integer value describes if first string is less than, equal to or greater than second string
		 * Suppose s1 and s2 are two string variables, you s1.concat(s2)
		 * If s1 == s2 : returns 0 
		 * If s1 > s2  : returns positive value 
		 * If s1 < s2  : returns negative value
		 */
		System.out.println(s6.compareTo(s6));
		System.out.println(s6.compareTo(s7));
		System.out.println(s6.compareToIgnoreCase(s7)); //sachin is equal to SACHIN
	}
	public static void testStringConcatenationByConcatOperator() {
		String s61 = "Sachin" + "Tendulkar";
		/*
		 * The Java compiler transforms above code to this: 
		 * String s=(new StringBuilder()).append("Sachin").append(" Tendulkar).toString(); 
		 * In java, String concatenation is implemented through the StringBuilder (or StringBuffer) class 
		 * The append method of the class produces a new string by appending the second operand onto the end of the first operand
		 */
		System.out.println(s61);
		String s62 = 50+30+"Sachin"+40+40;  
		/*
		 * The string concatenation operator can concat not only string but primitive values also
		 */
		System.out.println(s62);
	}
	public static void testStringConcatenationByConcatMethod() {
		System.out.println(s6); //sachin
		System.out.println(s7); //SACHIN
		s6.concat("tendulkar");
		System.out.println(s6); //sachin
		/*
		 * Here sachin is not changed but a new object sachintendulkar is created in SCP
		 * That is why string is known as immutable 
		 * Here, totally two objects are created "sachin" and "sachintendulkar" 
		 * But the reference variable s6 still refers to "sachin" not to "sachintendulkar"
		 */

		s6 = s6.concat("tendulkar");
		/*
		 * But if we explicitely assign the reference variable s6 to "sachintendulkar"as above, it will refer to it
		 * In such case, s6 will point to the "sachintendulkar"
		 * Please notice that the "sachin" object is still not modified*/
		System.out.println(s6); //sachintendulkar
	}
	public static void testSubstring() {
		/*
		 * Substring is a subset of another string 
		 * In case of substring: Start Index starts from 0. startIndex: inclusive endIndex: exclusive
		 * You can get substring from the given string object by one of the two methods:
		 * 
		 * public String substring(int startIndex): This method returns new String object containing the substring of the given string from specified startIndex (inclusive)
		 * public String substring(int startIndex, int endIndex): This method returns new String object containing the substring of the given string from specified startIndex to endIndex.
		 */
		System.out.println(s6.substring(1, 4));
		System.out.println(s6.substring(2));
	}
	public String testToString() {
		return this.rollNo + " " + this.name + " " + this.marks;
	}
//	public String toString() { //overriding java.lang.Object.toString
//		return this.rollNo + " " + this.name + " " + this.marks;
//	}
	public static void testStringClassMethods() {
		//length
		System.out.println(s6.length()); //6
		System.out.println(s8.length()); //6
		System.out.println(s9.length()); //16
		System.out.println(s10.length()); //28
		System.out.println();
		
		//isBlank and isEmpty
		System.out.println(s6.isBlank());
		System.out.println(s6.isEmpty());
		
		//charAt
		System.out.println(s6.charAt(1)); //aRequest you to please not cancel the order and deliver it as soon as possible.

		//System.out.println(s6.charAt(10)); //StringIndexOutOfBoundsException
		//System.out.println(s6.charAt(-1));  //StringIndexOutOfBoundsException
		
		//toUpperCase and toLowerCase
		System.out.println(s6.toUpperCase()); //SACHIN
		System.out.println(s7.toUpperCase()); //SACHIN
		System.out.println(s8.toUpperCase()); //SACHIN
		System.out.println(s8.toLowerCase()); //sachin
		System.out.println(s9.toLowerCase()); //    sachin      .
		System.out.println(s10.toLowerCase()); //    sachin      tendulkar   .
		System.out.println();
		
		//trim
		System.out.println(s9.trim()); //Trailing and leading spaces removed
		System.out.println(s10.trim()); //Trailing and leading spaces removed but not the space in between words
		System.out.println();
		
		//strip
		System.out.println(s10.strip()); //same as trim ?
		System.out.println();
		
		//startsWith and endsWith
		System.out.println(s6.startsWith("sa")); //true
		System.out.println(s6.startsWith("sax")); //false
		System.out.println(s8.startsWith("sa")); //false
		System.out.println(s8.startsWith("sA")); //true
		System.out.println(s6.startsWith(s6)); //true
		System.out.println(s6.endsWith("in")); //true
		System.out.println(s10.endsWith(" ")); //true
		System.out.println();
		
		//replace
		/*
		 * The string replace() method replaces all occurrence of first sequence of
		 * character with second sequence of character.
		 */
		System.out.println(s11.replace('J', 'K')); //replacing a single character
		System.out.println(s11.replace("Java", "Python")); //replacing a single word
		System.out.println(s11.replace("\\s", "")); //does not remove white spaces
		System.out.println();
		
		//replaceAll
		//System.out.println(s11.replaceAll('J', 'K')); //The method replaceAll(String, String) in the type String is not applicable for the arguments (char, char)
		System.out.println(s11.replaceAll("J", "K")); //replacing a single character
		System.out.println(s11.replaceAll("Java", "Python")); //replacing a single word
		System.out.println(s11.replaceAll("\\s", "")); //removing white spaces
		System.out.println();
		
		//intern
		/*
		 * A pool of strings, initially empty, is maintained privately by the class String. 
		 * When the intern method is invoked, if the pool already contains a string equal to this String object as determined by the equals(Object) method, then the string from the pool is returned 
		 * Otherwise, this String object is added to the pool and a reference to this String object is returned.
		 */
		String s61 = s6.intern();
		System.out.println(s61);
		String s62 = s2.intern();
		System.out.println(s62); //this object too resides in SCP i guess and thats why new string object not created in SCP ?
		
		//join
		String joinString1=String.join("-","welcome","to","javatpoint");  //join is a static method in String class
		System.out.println(joinString1);  
		
		String date1 = String.join("-","25","06","2019");
		System.out.println(date1);
		String date2 = String.join("/", "25","06","2019");
		System.out.println(date2);
		
		//Getting the type of object
		//System.out.println(i1.getClass); //Error : The primitive type of i1 does not have a field getClass
		System.out.println(i2.getClass());
		System.out.println(d2.getClass());
		System.out.println(c2.getClass());
		System.out.println(s6.getClass());
		System.out.println(date1.getClass());
		System.out.println(date2.getClass());
		System.out.println();
		
		//valueOf
		/*
		 * The string valueOf() method converts given type such as int, long, float,
		 * double, boolean, char and char array into string.
		 */
		System.out.println(String.valueOf(i1)); //10
		System.out.println(String.valueOf(i1)+10); //1010
		System.out.println(String.valueOf(d1)); //10.243
		System.out.println(String.valueOf(c1));
		System.out.println();
		
		//toString
		//System.out.println(i1.toString()); //Error : Cannot invoke toString() on the primitive type int
		System.out.println(i2);
		System.out.println(i2.getClass());
		System.out.println(i2.toString()); //converting to string
		System.out.println(i2.toString().getClass());
		System.out.println();
		
		//Overriding the toString method
		ExampleString example = new ExampleString(101, "Sachin", 90.765);
		System.out.println(example); //com.testprograms.StringExample@681a9515
		System.out.println(example.toString()); //com.testprograms.StringExample@681a9515 //doesnt convert an object to string
		//we can instead override the toString method from object class too as below
		//System.out.println(example.toString()); 
		
		System.out.println(example.testToString()); //own method to convert object to string representation

		System.out.println();
		
		//charAt
		System.out.println(s6.charAt(0));
		System.out.println(s9.charAt(0));
		
		//contains
		System.out.println("Test contains");
		System.out.println(s6.contains("cxh"));
		
		//indexOf
		System.out.println("\nTest indexOf");
		System.out.println(s6.indexOf("chi"));
		
		//split
		System.out.println("Test split");
		String[] temp = new String[10];
		String[] temp2 = new String[50];
		temp = s6.split("i");
		temp2 = s10.split(" ");
		
		for(String element : temp) {
			System.out.println(element);
		}
		
		System.out.println("Test split by space");
		for(String element : temp2) {
			System.out.println(element);
		}

	
		
	}
	public static void testStringFormatByFormatOperator() {
		System.out.println(String.format("name is %s", s6));
		System.out.println(String.format("name is %10s", s6));
		System.out.println(String.format("value is %100s", 32.34534));
		
		System.out.println(String.format("value is %f", 32.34534));
		System.out.println(String.format("value is %100f", 32.34534));
		
		//System.out.println(String.format("value is %100x", 32.34534)); //for %c, %d, %x etc java.util.IllegalFormatConversionException
		System.out.println(String.format("value is %10d", 32));
		System.out.println(String.format("value is %10x", 32));
		//System.out.println(String.format("value is %10f", 32)); //java.util.IllegalFormatConversionException
	}
	
	public static void main(String[] args) {
		//testStringComparisonByEqualsOperator();
		//testStringComparisonByEqualsMethod();
		//testStringComparisonByCompareToMethod();
		//testStringConcatenationByConcatOperator();
		//testStringConcatenationByConcatMethod();
		//testSubstring();
		testStringClassMethods();
		//testStringFormatByFormatOperator();


		

	}

}
