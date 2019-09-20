import java.util.Scanner;

public class Progression {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number:");
		int numberOfTerms = s.nextInt();
		printProgression(numberOfTerms);

	}
	public static void printProgression(int numberOfTerms) {
		double seriesDigit;
		System.out.println("i			n(i)");
		for(double i=1.0; i<=numberOfTerms; i++) {
			seriesDigit = i/(i+1);
			System.out.println(i + "			" + seriesDigit);
		}
	}
}
