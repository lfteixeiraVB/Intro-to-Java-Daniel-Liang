import java.io.IOException;
import java.util.Scanner;

public class Exercise_04_02 {

	public static void main(String[] args) throws IOException
	{	
		Scanner input  = new Scanner(System.in);
		double radius = 6371.01;
		double x1, x2, y1, y2;
		double d;
		
		/*READ VALUES*/
		System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		
		System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		
		/*CONVERT VALUES TO DEGREES*/
		x1 = Math.toRadians(x1);
		y1 = Math.toRadians(y1);
		
		x2 = Math.toRadians(x2);
		y2 = Math.toRadians(y2);
		
		/*Great Circle Distance*/
		d = radius * arccos(sin(x1)*sin(x2) + cos(x1)*cos(x2)*cos(y1-y2));
		
		
		/*Print Values*/
		System.out.println("The distance between the two points is " +d+ " km");
		
		input.close();
		
	}
	
	static double sin(double val)
	{
		return Math.sin(val);	
	}
	
	static double cos(double val)
	{
		return Math.cos(val);	
	}
	
	static double arccos(double val)
	{
		return Math.acos(val);	
	}
	
}
