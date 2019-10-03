package com.testprograms;
public class RandomCardPicker {
	public static void main(String[] args) {
		int iCardNumbers;
		int iCardShapes;
		String sCardNumber;
		String sCardShape;

		iCardNumbers = (int) (1 + (Math.random() * 13));
		iCardShapes = (int) (1 + (Math.random() * 4));
		
		if(iCardNumbers==1) sCardNumber = "Ace";
		else if(iCardNumbers==11) sCardNumber = "Jack";
		else if(iCardNumbers==12) sCardNumber = "Queen";
		else if(iCardNumbers==13) sCardNumber = "King";
		else sCardNumber = Integer.toString(iCardNumbers); //default case
		
		if(iCardShapes==1) sCardShape = "Clubs";
		else if(iCardShapes==2) sCardShape = "Diamonds";
		else if(iCardShapes==3) sCardShape = "Hearts";
		else sCardShape = "Spades";
		
		System.out.println("You picked the " + sCardNumber + " of " + sCardShape);
	}
}
