import java.util.Scanner;

public class Exercise_02_13 {

	public static void main(String[] args) 
	{	
		Scanner input = new Scanner(System.in);
		double month_rate = 0.00417;//0.05/12;
		
		System.out.print("Enter the monthly saving amount: ");
		double saving = input.nextDouble();
		double value = 0;
		double aux = 0;
		
		for (int i = 0; i < 6; i++) {
			
			aux = value + saving;			
			value = aux*month_rate + aux;

		}
			
		System.out.print("After the sixth month, the account value is $" + value);
		
		input.close();
	}
}
