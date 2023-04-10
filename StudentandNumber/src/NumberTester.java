/**Class: NumberTester.java
* @author Anh Thu Nguyen
* @version 1.0
* Course : ITEC 2140-05 Fall 2021
* Written: Oct 1, 2021
*
* This class – This class ask 2 numbers from user and test the Number class
*/

import java.util.Scanner;
public class NumberTester
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		double myNumb1 =  sc.nextDouble();
		System.out.print("Enter the first number: ");
		double myNumb2 =  sc.nextDouble();
		
		Number twoNumbers = new Number(myNumb1, myNumb2);
		System.out.println(twoNumbers);
		
		sc.close();
	}
}
