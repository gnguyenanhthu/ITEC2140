/**Class: CatTester2.java
* @author Anh Thu Nguyen
* @version 1.0
* Course : ITEC 2140-05 Fall 2021
* Written: Sep 23, 2021
*
* This class – now describe what the class does
*/

import java.util.Scanner;

public class CatTester2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a name: ");
		String myCatName = sc.nextLine();
		System.out.print("Enter a color: ");
		String myCatColor = sc.nextLine();
		System.out.print("Enter # of legs: ");
		int myCatNumOfLegs = sc.nextInt();
		System.out.print("Enter a year born: ");
		int myCatYearBorn = sc.nextInt();
		
		//use constructor to create a new cat object
		Cat cat1 = new Cat(myCatName, myCatColor, myCatNumOfLegs, myCatYearBorn);
		//output the cat named cat1
		System.out.println(cat1);
		System.out.print("Is Good Kitty: " + cat1.isGoodKitty());
		
		//Don't forget to close
		sc.close();
	}
}
