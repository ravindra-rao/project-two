import java.util.Scanner;

public class GeometricProgression {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the first digit of the geometric progression: ");
		int a1 = s.nextInt();
		System.out.print("Enter the common ratio of geometric series: ");
		int r = s.nextInt();
		System.out.print("Enter the total number of terms of geometric series: ");
		int n = s.nextInt();
		sumAndMean(a1, r, n);

	}
	public static void sumAndMean(int a1, int r,int n) {
		double sumTillNumberOfTerms, meanTillNumberOfTerms;
		double numerator = (a1*(1-(Math.pow(r, n))));
		double denominator = (1-r);
		sumTillNumberOfTerms = numerator / denominator;
		meanTillNumberOfTerms = sumTillNumberOfTerms/n;
		System.out.println("Sum = "+sumTillNumberOfTerms);
		System.out.println("Mean = "+meanTillNumberOfTerms);
	}

}
