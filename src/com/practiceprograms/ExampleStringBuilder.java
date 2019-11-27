package com.practiceprograms;

public class ExampleStringBuilder {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("Hello");
		StringBuilder sb2 = new StringBuilder();
		
		System.out.println(sb1.getClass());
		
		System.out.println(sb1);
		System.out.println(sb2);
		
		//capacity
		System.out.println(sb1.capacity());
		System.out.println(sb2.capacity()); //16 which is the default capacity
		
		//append
		//The StringBuilder append() method concatenates the given argument with this string.
		sb1.append("Java");
		System.out.println(sb1);
		
		//insert
		//The StringBuilder insert() method inserts the given string with this string at the given position.
		sb1.insert(1, "World");
		System.out.println(sb1);
		
		//replace
		//The StringBuilder replace() method replaces the given string from the specified beginIndex and endIndex.
		sb1.replace(3, 5, "Wassup");
		System.out.println(sb1);
		
		//delete
		//The delete() method of StringBuilder class deletes the string from the specified beginIndex to endIndex.
		sb1.delete(5, 7); //5 is inclusive and 7 is exclusive
		System.out.println(sb1);
		
		//reverse
		//The reverse() method of StringBuilder class reverses the current string.
		sb1.reverse();
		System.out.println(sb1);
		System.out.println(sb1.reverse()); //even if we modify the string in print statement, the string object holds its state
		System.out.println(sb1);
		
		//ensureCapacity
		//The ensureCapacity() method of StringBuilder class ensures that the given capacity is the minimum to the current capacity
		//If it is greater than the current capacity, it increases the capacity by (oldcapacity*2)+2
		//For example if your current capacity is 16, it will be (16*2)+2=34.
		System.out.println(sb1.capacity());
		System.out.println(sb2.capacity());
		sb2.append("Java is my favourite language");
		System.out.println(sb2.capacity()); ////now (16*2)+2=34 i.e (oldcapacity*2)+2  
		sb2.ensureCapacity(10);
		System.out.println("sb2 capacity"+sb2.capacity()); //no change and still 34
		System.out.println(sb2);
		sb2.ensureCapacity(70);
		System.out.println(sb2.capacity());
		System.out.println(sb2);
		
		//charAt
		//is used to return the character at the specified position.
		System.out.println(sb2.charAt(2));
		
		//length
		//is used to return the length of the string i.e. total number of characters.
		System.out.println("\n"+sb1.length());
		System.out.println(sb2.length());
		
		//substring
		//is used to return the substring from the specified beginIndex OR from the specified beginIndex and endIndex.
		System.out.println(sb2.substring(2)); //2 is inclusive
		System.out.println(sb2.substring(2, 14));
		

	}

}
