package com.testprograms;
import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		//milesToKilometers();
		degreesToFarenheit();
	}
	public static void milesToKilometers() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value in miles : ");
		double distanceMiles = s.nextDouble();
		
		double distanceKilometers = distanceMiles*1.60934;
		System.out.println("The entered value in kilometers is : "+distanceKilometers);
	}
	public static void degreesToFarenheit() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value in degree celsius : ");
		double tempCelcius = s.nextDouble();
		
		double tempFarenheit = ((tempCelcius/5)*9)+32;
		System.out.println("The entered value in farenheit is : "+tempFarenheit);
		System.out.print("its gonna get very cold");
	}
}
