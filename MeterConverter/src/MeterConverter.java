/**Class: MeterConverter.java
* @author Anh Thu Nguyen
* @version 1.0
* Course : ITEC 2140-05 Fall 2021
* Written: Aug 24, 2021
*
* This program converts a number in meters to inches
*/
import java.util.Scanner;

public class MeterConverter
{
	public static void main(String[] args) 
	{
		double numOfMeters, numOfInches;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input the number of meters: "); //ask the user for meters
		numOfMeters = sc.nextDouble();
		numOfInches = 39.37 * numOfMeters; //convert to inches: 1 meter = 39.37 inches
		System.out.println(numOfMeters + " meters is " + numOfInches + " inches"); //output
		sc.close();
	}
}
