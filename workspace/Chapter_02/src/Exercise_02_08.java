import java.util.Scanner;

public class Exercise_02_08 {

	public static void main(String[] args) 
	{	
		/*Create an object*/
		Scanner input  = new Scanner(System.in);
		
		System.out.print("Enter the time zone offset to GMT: ");

		
		long totalMilliseconds = System.currentTimeMillis();
		
		long totalSeconds = totalMilliseconds / 1000;
		
		long currentSecond = totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		
		long currentMinute = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		
		long currentHour = totalHours % 24;
		
		System.out.println("Current time is " +currentHour+ ":" +currentMinute+ ":" +currentSecond+ " GMT");
		
		
		input.close();
	}
}
