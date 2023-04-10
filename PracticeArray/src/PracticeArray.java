/**Class: PracticeArray.java
* @author Anh Thu Nguyen
* @version 1.0
* Course : ITEC 2140-05 Fall 2021
* Written: Nov 2, 2021
*
* This class – now describe what the class does
*/
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;


public class PracticeArray
{
	public static void main(String[] args)
	{
		//int[] intArray = {3, 6, 5, 2};
		Scanner sc = new Scanner(System.in);
		
		//System.out.println(Arrays.toString(intArray));
		
		Random ran = new Random();
		
		int[] intArray = new int[10];
		
		for (int i = 0; i < intArray.length; i++)
		{
			int gennedInt = ran.nextInt(21);
			intArray[i] = gennedInt;
		}
		System.out.println(Arrays.toString(intArray));
		
		int[] intArray2 = new int[10];
		
		for (int i = 0; i < intArray2.length; i++)
		{
			int gennedInt = ran.nextInt(21);
			intArray2[i] = gennedInt;
		}
		System.out.println(Arrays.toString(intArray2));


		int sum = 0;
		for (int i = 0; i < intArray.length; i++)
		{
			sum += intArray[i];
		}
		System.out.println("Total: " + sum); // find min
		
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < intArray.length; i++)
		{
			if (min > intArray[i])
			{
				min = intArray[i];
			}
		}
		System.out.println("Min: " + min); // find min
		
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < intArray.length; i++)
		{
			if (max < intArray[i])
			{
				max = intArray[i];
			}
		}
		System.out.println("Max: " + max); // find max
		
		/*System.out.print("Type number you want to find: ");
		int numToFind = sc.nextInt();
		boolean found = false;
		for (int i = 0; i < intArray.length; i++)
		{
			if (intArray[i] == numToFind)
			{
				found = true;
			}
		}
		System.out.println(numToFind + " is in array: " + found);
		
		int count = 0;
		for (int i = 0; i < intArray.length; i++)
		{
			if (intArray[i] == numToFind)
			{
				++count;
			}
		}
		System.out.println(numToFind + " appears: " + count + " times");*/
		
		int[] intArray3 = new int[20];
		for (int i = 0; i < intArray.length; i++)
		{
			intArray3[2*i] = intArray[i];
			intArray3[2*i+1] = intArray2[i];
		}
		System.out.println(Arrays.toString(intArray3));
	}
}
