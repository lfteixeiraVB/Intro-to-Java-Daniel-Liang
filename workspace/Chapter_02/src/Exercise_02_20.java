import java.io.PrintStream;
import java.util.Scanner;

public class Exercise_02_20 {

	public static void main(String[] args) 
	{	
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		double balance;
		double anualInterestRate;
		double interest;
		
		output.print("Enter balance and interest rate (e.g., 3 for 3%): ");
		balance = input.nextDouble();
		anualInterestRate = input.nextDouble();
		
		interest = balance * (anualInterestRate/1200);
		
		output.println("The interest is " + interest);
		
	}
	
	
}
