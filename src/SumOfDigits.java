import java.util.Scanner;
public class SumOfDigits 
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        int m = s.nextInt();
       
        System.out.println("Sum of Digits:"+sumDigits(m));
    }
    public static int sumDigits(int m) {
    	int n, sum = 0;
    	while(m > 0)
        {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
    	return sum;
    	
    }
}