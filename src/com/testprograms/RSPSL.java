package com.testprograms;
import java.util.Random;
import java.util.Scanner;

public class RSPSL {
	public static void main(String[] args) {
		int compChoice = 0, userChoice = 0;

		// Comp Choice
		Random generator = new Random();
		compChoice = generator.nextInt(5) + 1;

		// User Choice
		System.out.println("Rock(1), Scissors (2), Paper(3) , Spock (4), Lizard (5): Guess?  ");
		Scanner scanner = new Scanner(System.in);
		userChoice = scanner.nextInt();

		switch (userChoice) {
		case 1:
			System.out.println("The User is Rock ");
			break;
		case 2:
			System.out.println("The User is Scissors ");
			break;
		case 3:
			System.out.println("The User is Paper ");
			break;
		case 4:
			System.out.println("The User is Spock ");
			break;
		case 5:
			System.out.println("The User is Lizard ");
			break;
		}

		switch (compChoice) {
		case 1:
			System.out.print("The Computer is Rock. ");
			break;
		case 2:
			System.out.print("The Computer is Scissors. ");
			break;
		case 3:
			System.out.print("The Computer is Paper. ");
			break;
		case 4:
			System.out.print("The Computer is Spock. ");
			break;
		case 5:
			System.out.print("The Computer is Lizard. ");
			break;
		}

		// Determine who wins
		switch (userChoice) {
		case 1: // User chooses Rock
			if (compChoice == 1) // Rock
			{
				System.out.print("Tie, try again");
			} else if (compChoice == 2) // Scissors
			{
				System.out.print("WIN : Rock Crushes Scissors!");
			} else if (compChoice == 3) // Paper
			{
				System.out.print("LOSE : Paper Covers Rock");
			} else if (compChoice == 4) // Spock
			{
				System.out.print("LOSE : Spock vaporizes Rock");
			} else if (compChoice == 5) // Lizard
			{
				System.out.print("WIN : Rock Crushes Lizard!");
			}
			break;

		case 2: // User chooses Scissors
			if (compChoice == 1) // Rock
			{
				System.out.print("LOSE : Rock Crushes Scissors");
			} else if (compChoice == 2) // Scissors
			{
				System.out.print("Tie, try again");
			} else if (compChoice == 3) // Paper
			{
				System.out.print("WIN : Scissors Cut Paper!");
			} else if (compChoice == 4) // Spock
			{
				System.out.print("LOSE : Spock smashes Scissors");
			} else if (compChoice == 5) // Lizard
			{
				System.out.print("WIN : Scissors Decapitate Lizard!");
			}
			break;

		case 3: // User chooses Paper
			if (compChoice == 1) // Rock
			{
				System.out.print("WIN : Paper Covers Rock!");
			} else if (compChoice == 2) // Scissors
			{
				System.out.print("LOSE : Scissors Cut Paper");
			} else if (compChoice == 3) // Paper
			{
				System.out.print("Tie, try again");
			} else if (compChoice == 4) // Spock
			{
				System.out.print("WIN : Paper disproves Spock!");
			} else if (compChoice == 5) // Lizard
			{
				System.out.print("LOSE : Lizard Eats Paper");
			}
			break;

		case 4: // User chooses Spock
			if (compChoice == 1) // Rock
			{
				System.out.print("WIN : Spock vaporizes Rock!");
			} else if (compChoice == 2) // Scissors
			{
				System.out.print("WIN : Spock smashes Scissors!");
			} else if (compChoice == 3) // Paper
			{
				System.out.print("LOSE : Paper disproves Spock");
			} else if (compChoice == 4) // Spock
			{
				System.out.print("Tie, try again");
			} else if (compChoice == 5) // Lizard
			{
				System.out.print("LOSE : Lizard Poisons Spock");
			}
			break;

		case 5: // User chooses Lizard
			if (compChoice == 1) // Rock
			{
				System.out.print("LOSE : Rock Crushes Lizard");
			} else if (compChoice == 2) // Scissors
			{
				System.out.print("LOSE : Scissors Decapitate Lizard");
			} else if (compChoice == 3) // Paper
			{
				System.out.print("WIN : Lizard Eats Paper!");
			} else if (compChoice == 4) // Spock
			{
				System.out.print("WIN : Lizard Poisons Spock!");
			} else if (compChoice == 5) // Lizard
			{
				System.out.print("Tie, try again");
			}
			break;

		default:
			System.out.println("There was an error. Please try again.");
			break;
		}
		scanner.close(); // closing scanner after its usage
	}
}