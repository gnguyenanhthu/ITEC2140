/**Class: SquareTester.java
* @author Anh Thu Nguyen
* @version 1.0
* Course : ITEC 2140-05 Fall 2021
* Written: Sep 14, 2021
*
* This class - contains a main—this is the one you will run 
*/
import java.util.Scanner;

public class SquareTester
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the length of the side: ");
		double len = sc.nextDouble();
		Square mySquare = new Square(len); 
		System.out.println(mySquare);
		System.out.println("Area: " + mySquare.computeArea());
		System.out.println("Diag: " + mySquare.computeDiagonal());
		System.out.println("Double len: "+ mySquare.computeDoubleLength());
		System.out.println("Perimeter: " + mySquare.computePerimeter());
		sc.close();
	}
}
