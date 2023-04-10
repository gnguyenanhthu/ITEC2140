/**Class: FruitArrayTester.java
* @author Anh Thu Nguyen
* @version 1.0
* Course : ITEC 2140-05 Fall 2021
* Written: Nov 4, 2021
*
* This class – now describe what the class does
*/

import java.util.*;
public class FruitArrayTester
{
	public static void main(String[] args)
	{
		int[] array = new int[10];
		Fruit[] fArray = new Fruit[6];
		
		array[0] = 2;
		array[1] = 4;
		System.out.println(Arrays.toString(array));
		Fruit fruit_1 = new Fruit("Strawberry", "A strawberry from Da Lat is sweet and sour", 300);
		Fruit fruit_2 = new Fruit("Apple", "!!!No pesticide, very sweet", 650);
		Fruit fruit_3 = new Fruit("Mango", "100% fresh", 125);
		Fruit fruit_4 = new Fruit("Cherry", "Check if this is a yummy cherry", 900);

		fArray[0] = new Fruit("orange", "delicious", 45);
		fArray[1] = new Fruit("coconut", "creamy and sweet", 90);
		fArray[2] = fruit_1;
		fArray[3] = fruit_2;
		fArray[4] = fruit_3;
		fArray[5] = fruit_4;

		System.out.println(Arrays.toString(fArray));
		System.out.println(">=45");

		
		for (int i = 0; i < fArray.length; i++)
		{
			if (fArray[i].getNumberOfCalories() >= 45)
				System.out.println(fArray[i]);
		}
		
		System.out.println("Contain o");
		for (int i = 0; i < fArray.length; i++)
		{
			if (fArray[i].getName().toLowerCase().contains("o"))
				System.out.println(fArray[i]);
		}

		System.out.println("Contain e");
		for (int i = 0; i < fArray.length; i++)
		{
			if (fArray[i].getDescription().toLowerCase().contains("e"))
				System.out.println(fArray[i]);
		}
	}
}
