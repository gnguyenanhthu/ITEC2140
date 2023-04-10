/**Class: LiterConverter.java
* @author Anh Thu Nguyen
* @version 1.0
* Course : ITEC 2140-05 Fall 2021
* Written: Aug 24, 2021
*
* This program converts a number of liters to ounces
*/

import java.util.Scanner;

public class LiterConverter
{
	public static void main(String[] args) 
	{
		double numOfLiters, numOfOunces;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input the number of liters: "); //ask the user for meters
		numOfLiters = sc.nextDouble();
		numOfOunces = 33.814 * numOfLiters; //convert to ounces: 1 liter = 33.814 ounces
		System.out.println(numOfLiters + " liters is " + numOfOunces + " ounces"); //output
		sc.close();
	}
}