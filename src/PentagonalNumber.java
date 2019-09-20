import java.util.Scanner;
public class PentagonalNumber {
public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 System.out.println("Enter the number of Pentagonal Numbers required");
	 int numberOfTerms = input.nextInt(); 

	 System.out.println("The pentagonal numbers are :");
   		int count = 1;
		for(int i = 1; i <= numberOfTerms; i++){
			System.out.printf("%-6d",getPentagonalNumber(i));
			if(count % 10 == 0) System.out.println();
			count++;
		}
    }
  public static int getPentagonalNumber(int i) {
		return (i * (3 * i - 1))/2;
	}
}


