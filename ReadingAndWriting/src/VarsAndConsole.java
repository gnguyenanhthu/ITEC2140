/**Class: VarsAndConsole.java
* @author Anh Thu Nguyen
* @version 1.0
* Course : ITEC 2140-05 Fall 2021
* Written: Aug 19, 2021
*
* This class – now describe what the class does
*/
import java.util.Scanner;

public class VarsAndConsole
{
	public static void main(String[] args)
	{
		//write a program that converts inches to meters
		//double inches = 2;
		/*double num1 = 6, num2 = 8;
		//double num3 = 9;
		int inches = 2, num3 = 9;
		System.out.println(inches + num1 + num2);
		System.out.println("inches + num1 + num2");
		System.out.println("Total is " + (inches + num1 + num2));
		//When there's a String, it's no longer math!!!
		//CONCATENATION
		
		//% modulo symbol -- remainder
		System.out.println(num1 / inches);
		System.out.println(num1 % inches);
		System.out.println(inches / num2);
		System.out.println(inches % num2);
		
		System.out.println("num3 / inches = "+ (num3 / inches)); //9./2.
		System.out.println("num3 % inches = " + (num3 % inches)); //9.%2.*/
		
		Scanner sc = new Scanner(System.in); //Creating a new Scanner object named sc using API
		
		System.out.print("Enter number of inches to convert: ");
		double inches = sc.nextDouble();
		System.out.println("Inches: " + inches);
		double meters = .0254 * inches;
		System.out.println("Meters: " + meters);

	}
}
