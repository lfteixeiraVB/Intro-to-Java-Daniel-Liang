import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Exercise_03_04 {

	public static void main(String[] args) throws IOException
	{	
		Scanner input  = new Scanner(System.in);
		Random r = new Random();
		
		int Low = 1;
		int High = 12;
		int Result = r.nextInt(High-Low) + Low;
		
		System.out.println("Generated number: "+ Result);
		
		switch (Result) 
		{
			case 1: System.out.println("Month: Janeiro");			
			break;
			
			case 2: System.out.println("Month: Fevereiro");			
			break;
			
			case 3: System.out.println("Month: Mar�o");			
			break;
			
			case 4: System.out.println("Month: Abril");			
			break;
			
			case 5: System.out.println("Month: Maio");			
			break;
			
			case 6: System.out.println("Month: Junho");			
			break;
			
			case 7: System.out.println("Month: Julho");			
			break;
			
			case 8: System.out.println("Month: Agosto");			
			break;
			
			case 9: System.out.println("Month: Setembro");			
			break;
			
			case 10: System.out.println("Month: Outubro");			
			break;
			
			case 11: System.out.println("Month: Novembro");			
			break;
				
			case 12: System.out.println("Month: Dezembro");			
			break;

		}
		
		input.close();
		
	}

}
