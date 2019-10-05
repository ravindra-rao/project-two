package com.testprograms;
public class StringExample {
	public static void main(String[] args) {
		String s1 = new String("ABC");
		/*
		 * When creating string using "new" keyword : 
		 * 		A string object ABC will be created in SCP (1 object)
		 *      Another string object ABC will be created in the Heap memory too (1 object) 
		 *      The variable s1 will refer to the ABC in the Heap Memory
		 *      Thus, total (1 object) + (1 object) = (2 objects) will be created
		 */
		String s2 = new String("ABC");
		/*
		 * Now with this, another string object ABC will be created in the Heap Memory (1 object)
		 * But this will not create another object in SCP
		 * Thus, total (1 object) will be created
		 */
		String s3 = "ABC";
		/*
		 * Now with this, no object will be created in the heap memory 
		 * And also since ABC is already existing in SCP, it will not create another object in SCP 
		 * Only the variable s3 will refer to the existing string object ABC in SCP 
		 * Thus, no objects are created
		 */
		String s4 = "ABC";
		/*
		 * Now with this too, no object will be created in the heap memory 
		 * And also since ABC is already existing in SCP, it will not create another object in SCP 
		 * Only the variable s4 will refer to the existing string object ABC in SCP 
		 * Thus, no objects are created
		 */
		String s5 = "BCD";
		/*
		 * Now with this, no object will be created in the heap memory 
		 * And since BCD is not already existing in SCP, it will create an object in SCP 
		 * Only the variable s5 will refer to the string object BCD in SCP 
		 * Thus, total (1 object) will be created
		 */
		
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
		
		
		//==operator will compare the references and not the actual values of the string objects
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
	}

}
