/**Class: BMIConverter.java
* @author Anh Thu Nguyen
* @version 1.0
* Course : ITEC 2140-05 Fall 2021
* Written: Aug 25, 2021
*
* This program compute BMI based on weight and height given by the user
*/
import java.util.Scanner;

public class BMIConverter
{
	public static void main(String[] args) 
	{
		double numOfWeights, numOfMeters, numOfBmi;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input weight (kg): ");
		numOfWeights = sc.nextDouble();
		System.out.print("Input height (meters): ");
		numOfMeters = sc.nextDouble();
		
		//BMI = weight / (height^2)
		numOfBmi = numOfWeights / (numOfMeters * numOfMeters);
		System.out.print("Body Mass Index is: " + numOfBmi);
		sc.close();
	}
}
