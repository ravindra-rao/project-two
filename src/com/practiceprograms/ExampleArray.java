package com.practiceprograms;

import java.util.Arrays;
import java.util.Scanner;


public class ExampleArray {

	public static void main(String[] args) {
		test1DArray();
		//test2DArray();
	}
	
	public static void test2DArray() {
		//Declaration of 2D arrays
		/*
		 * Declaring a 2d array can be done by any of the below : 
		 * dataType[][] arrayRefVar; (or) 
		 * dataType [][]arrayRefVar; (or) 
		 * dataType arrayRefVar[][]; (or) 
		 * dataType []arrayRefVar[];
		 */
		//int[][] data1 = new int[][]; //variable must provide either dimension expressions or an array initializer
		int[][] data1;
		int [][]data2;
		int data3[][];
		int []data4[];
		
		//Declaration and instantiation of a 2D array
		double[][] data5 = new double[2][3]; //creates an array of 2 rows and 3 columns
		
		//Initialization of 2D arrays
		data5[0][0] = 1;
		data5[0][1] = 2.0;
		data5[0][2] = 3.4;
		//data5[0][3] = 3; //No compile time error but java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		data5[1][0] = 4.5431;
		data5[1][1] = 5;
		data5[1][2] = data5[1][0] + data5[1][1];
		//data5[1][3] = 6; //No compile time error but java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		
		//Declaration, instantiation and initialization of 2D array :
		//double[][] data6 = new double[2][3];
		//data6 = {{1,2,3},{4,5,6}}; //Compile time error : Array constants can only be used in initializers
		double[][] data6 = {{1,2,3},{4,5,6}};
		
		System.out.println(data6); //[[D@24d46ca6
		System.out.println(data6.length); //2 which is the number of rows
		System.out.println(data6[0].length); //number of columns in row 1
		System.out.println(data6[1].length); //number of columns in row 2
		
		print2DArray(data5);
		
		//Sending anonymous 2D arrays for printing
		//array of length 2*3
		print2DArray(new double[][] {	{1,2,3},
										{4,5,6}
									});
		
		//array of length 3*5 i.e. with same number of columns
		print2DArray(new double[][] {	{1,2,3,4,5}, 
										{6,7,8,9,10}, 
										{11,12,13,14,15}
									});
		
		
		
		
		
		
		//Jagged Array 
		/*
		 * A jagged array is an array of arrays with different number of columns
		 * If we are creating odd number of columns in a 2D array, it is known as a jagged array. 
		 */
		print2DArray(new double[][] {	{1,2,3}, 
										{6,7,8,9}, 
										{11,12,13,14,15}
									});
		
		try {
			System.out.println("\njagged array print2DArray :");
			//The below throws exception
			//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
			print2DArray(new double[][] {	{1,2,3,4,5}, 
											{6,7,8,9}, 
											{11,12,13}
										});
		} catch(ArrayIndexOutOfBoundsException e) {		
			System.out.println();
		}
		finally {
			System.out.println("\njagged array print2DArrayAnyLength :");
			print2DArrayAnyLength(new double[][] {	{1,2,3,4,5}, 
				{6,7,8,9}, 
				{11,12,13}
			});
		}
		
		

		//Sum of two 2D matrices
		print2DArrayAnyLength(sumMatrices(new double[][] {{1,2,3,4},{4,5,6,4}}, new double[][] {{1,2,3,5},{4,5,6,5}}));

		
		//Product of two 2D matrices
		print2DArrayAnyLength(prodMatrices(new double[][] {{1,1},{2,2}}, new double[][] {{1,1},{2,2}}));
		
		

	}

	public static void test1DArray() {
		// declaring, instantiating and initializing a single dimensional array
		double[] data0; // declaring an array
		/*
		 * data0 = new int[10]; //Type mismatch : cannot convert from int[] to double[]
		 * data0 = new String[10]; //Type mismatch : cannot convert from String[] to
		 * double[] double[] data0 = new Double[10]; //Type mismatch : cannot convert from Double[] to double[]
		 */
		data0 = new double[10]; // instantiating an array

		double[] data1 = new double[10]; // declaring and instantiating an array
		System.out.println(data1.length);
		data1[0] = 1.1; // initializing the array
		data1[1] = 1.2;
		data1[2] = 1.3;
		data1[3] = data1[2] + data1[1]; // accessing array elements by indexing
		print1DArray(data1); // passing an array to a method

		double[] data2 = { 1.1, 1.2, 1.3 }; // declaring, instantiation and initializing an array
		System.out.println(data2.length);
		print1DArray(data2);

		// double[] data3 = new double[10] {1.1, 2.2, 3.3}; //cannot define dimension
		// expressions when an array initializer is provided

		// anonymous array
		/*
		 * Java supports the feature of an anonymous array So you don't need to declare
		 * the array while passing an array to the method.
		 */
		print1DArray(new double[] { 10, 12.2 });

//		double[] data3;
//		data3 = {1.1, 1.2, 1.3}; //Compile time error //Array constants can only be used in initializers

		print1DArray(get1DRandomAnonymousIntegerArray());
		print1DArray(get1DIntegerArray());

		
		
		// ArrayIndexOutOfBoundsException
		/*
		 * The Java Virtual Machine (JVM) throws an ArrayIndexOutOfBoundsException if length of the array in negative, equal to the array size or greater than the
		 * array size while traversing the array. 
		 */
		//printArrayException(new double[] {1.1, 2.2}); 
		//java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
		
		int[] data4 = new int[10];
		System.out.println("\n"+data4.getClass());
		Class c = data4.getClass();
		String name = c.getName();
		System.out.println(name);
		System.out.println(data4.getClass().getName());
		//In Java, an array is an object
		//For array object, a proxy class is created whose name can be obtained by getClass().getName() method on the object.
	
		
		
		
		//Initializing arrays with input values
		double[] data5 = new double[5];
		//data5 = initialize1DArrayWithInputValues(data5);
		//print1DArray(data5);
		
		
		//Initializing arrays with random values
		double[] data6 = new double[5];
//		data5 = initialize1DArrayWithRandomValues(data6);
//		print1DArray(data6);
		
		
		
		//Copying a 1D array
		//We can copy an array to another by the arraycopy() method of System class.
		char[] copyFrom = {'j','a','v','a','t','p','o','i','n','t'}; //declaring and initializing source array
		char[] copyTo = new char[4];
		System.arraycopy(copyFrom, 2, copyTo, 0, 4);
		System.out.println("\n"+String.valueOf(copyTo));
		
		String[] copyFrom2 = {"j","a","v","a","t","p"};
		char[] copyTo1 = {'h','i'}; //array of length 2 only. once the array is created, its size is fixed. It cannot be changed
		String[] copyTo2 = new String[15];
		for(int i=0; i<3; i++) {
			copyTo2[i] = String.valueOf(i);
		}
		System.arraycopy(copyFrom2, 2, copyTo2, 2, 4);
		System.out.println("\n"+String.valueOf(copyTo2));
		for(String ch : copyTo2) {
			System.out.println(ch);
		}
		

		//Cloning an array
		/*
		 * Since, Java array implements the Cloneable interface, we can create the clone of the Java array 
		 * If we create the clone of a single-dimensional array, it creates the deep copy of the Java array which means it copies the actual values 
		 * But, if we create the clone of a multidimensional array, it creates the shallow copy of the Java array which means it copies the references only
		 */
		int[] srcArray = {33,34,35};
		int[] targetArray = srcArray.clone();
		System.out.println("\nsrcArray == targetArray ? : "+(srcArray==targetArray)); //not sure why this is giving 
		System.out.println("\nsrcArray.equals(targetArray ? : "+(srcArray.equals(targetArray))); //not sure why this is giving false
		
		
		
		
		//Sorting an array
		/*
		 * Sorting is frequently used in programming 
		 * Thus, Java provides several overloaded sort methods for sorting an array of int, double, char, short,long, and float in the java.util.Arrays class 
		 * For example, the following code sorts an array of numbers and an array of characters. 
		 * Java 8 now provides Arrays.parallelSort(list) that utilizes the multicore for fast sorting.
		 */
		double[] data7 = {2.1, 1.4, 5.4, 0.2};
		print1DArray(data7);
		Arrays.sort(data7);
		print1DArray(data7);
		
		char[] chars = {'a', 'A', '4', 'F', 'D', 'P'};
		System.out.println("\n"+String.valueOf(chars));
		Arrays.sort(chars);
		System.out.println(String.valueOf(chars));
		
		char[] chars2 = {'a', 'A', '4', 'F', 'D', 'P'};
		System.out.println("\n"+String.valueOf(chars));
		Arrays.parallelSort(chars2);
		System.out.println(String.valueOf(chars));
	}

	public static double[] get1DIntegerArray() {
		double[] data = new double[10];
		for (int i = 0; i < data.length; i++) {
			data[i] = Math.random() * 10;
		}
		return data; //returning an array
	}

	public static double[] get1DRandomAnonymousIntegerArray() {
		return new double[] { 3.3, 4.4, 5.5 };
	}

	public static void print1DArray(double[] sampleArray) {
		//passing a 1D array to a method
		//traversing a 1D array
		for (int i = 0; i < sampleArray.length; i++) {
			System.out.println(sampleArray[i]);
		}
		System.out.println();
	}
	
	public static void print2DArray(double[][] sampleArray) {
		//passing a 2D array to a method
		//traversing a 2D array
		//can print a 2D array of any length
		System.out.println();
		for(int i=0; i<sampleArray.length; i++) {
			for(int j=0; j<sampleArray[0].length; j++) {
				System.out.print(sampleArray[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void print2DArrayAnyLength(double[][] sampleArray) {
		//passing a 2D array to a method
		//traversing a 2D array
		//can print a 2D array of any length
		System.out.println();
		for(int i=0; i<sampleArray.length; i++) {
			for(int j=0; j<sampleArray[i].length; j++) {
				System.out.print(sampleArray[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void print1DArrayException(double[] sampleArray) {
		// traversing an array
		for (int i = 0; i < 100; i++) {
			System.out.println(sampleArray[i]);
		}
		System.out.println();
	}

	public static double[] initialize1DArrayWithInputValues(double[] sampleData) {
		System.out.println("\n############");
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<sampleData.length;i++) {
			sampleData[i] = scanner.nextDouble();
		}
		return sampleData;
	}
	
	public static double[] initialize1DArrayWithRandomValues(double[] sampleData) {
		System.out.println("\n############");
		for(int i=0; i<sampleData.length;i++) {
			sampleData[i] = (double) Math.random()*10;
		}
		return sampleData;
	}

	public static double[][] sumMatrices(double[][] matrixOne, double[][] matrixTwo) {
		double[][] sum = new double[matrixOne.length][matrixOne[0].length];
		//The below code was supposed to validate the nrows and ncols of the two matrices
//		int matrixOneRows = matrixOne.length;
//		int matrixTwoRows = matrixTwo.length;
//		boolean checkRows;
//		boolean[] checkCols = new boolean[matrixOne.length];
//		
//		if(matrixOneRows==matrixTwoRows) {
//			for(int i=0; i<matrixOneRows; i++) {
//				if(matrixOne[i].length != matrixTwo[i].length) {
//					checkCols[i]=false;
//				}
//				else {
//					checkCols[i]=true;
//				}
//			}
//			
//		}
//		else {
//			checkRows=false;
//		}
//		
		
		for(int i=0; i<matrixOne.length; i++) {
			for(int j=0; j<matrixOne[0].length; j++) {
				sum[i][j] = matrixOne[i][j] + matrixTwo[i][j];
			}
		}
		
		return sum;
	}

	public static double[][] prodMatrices(double[][] matrixOne, double[][] matrixTwo) {
		double[][] prod = new double[matrixOne.length][matrixTwo[0].length];

		if (matrixOne.length != matrixTwo[0].length) {
			System.out.println("Matrix multiplication not possible");
		} else {
			for (int i = 0; i < matrixOne.length; i++) {
				for (int j = 0; j < matrixOne[0].length; j++) {
					prod[i][j] = 0;
					for (int k = 0; k < matrixOne[0].length; k++) {
						prod[i][j] = prod[i][j] + (matrixOne[i][k] * matrixTwo[k][j]);
					}
				}
			}
		}

		return prod;
	}
}

