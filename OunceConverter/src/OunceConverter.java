/**Class: OunceConverter.java
* @author Anh Thu Nguyen
* @version 1.0
* Course : ITEC 2140-05 Fall 2021
* Written: Aug 26, 2021
*
* This class – now describe what the class does
*/

import java.util.Scanner; //step 1 for reading input

public class OunceConverter
{
	public static void main(String[] args)
	{
		final double OUNCES_TO_CUPS = .125;
		final double OUNCES_TO_POUNDS = .0625;

		//In the converter assignment you must look at directions and when I run
		//your code the prompts (the text part) must look exactly like the spec. 
		//The user input can differ!!!
		
		//Prompt the user for ounces -- of type double
		//read the input
		//do the math --> num of ounces * .125 gives cups (cups will be a double)
		//print out the results formatted correctly
		
		System.out.print("Enter the number of ounces: ");
		//How do we read input?
		//1. import the Scanner (below the header comments)
		//2.declare and initialize a Scanner --back to main
		//3. determine data type user has entered and use correct method to read 
		//4. assign result to a var
		//5. Do not forget to close your Scanner at end of program
		
		Scanner sc = new Scanner(System.in); //step 2
		//Scanner is a data type
		//sc is the name of the Scanner -- var name
		// = is the assn operator
		//new Scanner(System.in) creates the new Scanner for us (value)
		
		//NoNE of your assignments will EVER require more than 1 Scanner
		double ounces = sc.nextDouble();  //step 3 and 4
		double cups = ounces * OUNCES_TO_CUPS;
		double pounds = ounces * OUNCES_TO_POUNDS;
		System.out.println(ounces + " ounce/s is " + cups + " cups");
		System.out.println(ounces + " ounce/s is " + pounds + " pounds");
		
		sc.close(); //step 5
	}

}