/**Class: MyFitbit.java
* @author Anh Thu Nguyen
* @version 1.0
* Course : ITEC 2140-05 Fall 2021
* Written: Aug 31, 2021
*
* This program computes the distance walked by the user (miles, feet, inches)
* based on the user’s stride length and the number of steps walked
*/
import java.util.Scanner;

public class MyFitbit
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		final int INCHES_PER_FOOT = 12, INCHES_PER_MILE = 63360;
		int feetStrideLength, inchesStrideLength, totalSteps, totalInches, resultMiles, resultFeet, resultInches;
		
		System.out.println("My Fitbit \n________________________________________\n");
		System.out.print("Enter your stride length (feet only): ");
		feetStrideLength = sc.nextInt();
		System.out.print("Enter your stride length (inches only): ");
		inchesStrideLength = sc.nextInt();
		System.out.print("Enter the number of steps you walked: ");
		totalSteps = sc.nextInt();
		
		//Math
		totalInches = (feetStrideLength * INCHES_PER_FOOT + inchesStrideLength) * totalSteps;
		resultMiles = totalInches / INCHES_PER_MILE; //inches -> miles
		resultFeet = (totalInches % INCHES_PER_MILE) / INCHES_PER_FOOT; //remained inches -> feet
		resultInches = (totalInches % INCHES_PER_MILE) % INCHES_PER_FOOT; //remained inches
		
		System.out.print("You walked " + resultMiles + " miles, " + resultFeet + " feet, and " + resultInches + " inches.");
	}
}
