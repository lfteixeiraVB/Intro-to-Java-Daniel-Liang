import java.io.IOException;

public class Exercise_01_10 {
	
	public static void main(String[] args) throws IOException
	{
		double km = 14;
		double miles = km/1.6;
		
		double time_min = 45.0;
		double time_sec = 30;
		
		double hour = time_min/60;
		double hour2 = time_sec/3600.0;
		
		hour = hour + hour2;
		
		double mile_per_hour = miles/hour;
		
		System.out.printf("MILES PER HOUR: %.2f\n", mile_per_hour);
		

	}
}
