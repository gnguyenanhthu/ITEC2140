/**Class: CommonArray.java
* @author Anh Thu Nguyen
* @version 1.0
* Course : ITEC 2140-05 Fall 2021
* Written: Nov 2, 2021
*
* This class – now describe what the class does
*/

import java.util.*;

public class CommonArray
{
	public int[] generateArray(int size)
	{
		int[] arr = new int[size];
		Random ran = new Random();
		
		for (int i = 0; i < arr.length; i++)
		{
			int gennedInt = ran.nextInt(21);
			arr[i] = gennedInt;
		}
		return arr;
	}
	public int findArrayTotal(int[] arr)
	{
		int total = 0;
		for (int i = 0; i < arr.length; i++)
		{
			total += arr[i];
		}
		return total;
	}
	
	public int findMax(int[] arr) 
	{
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++)
		{
			if (max < arr[i])
			{
				max = arr[i];
			}
		}
		return max;
	}
	
	public int find2Max(int[] arr) 
	{
		int max = Integer.MIN_VALUE, secondBiggest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++)
		{
			if (max < arr[i])
			{
				secondBiggest = max;
				max = arr[i];
			}
		}
		return secondBiggest;
	}
	
	
	/*public double findArrayAverage(int[] arr)
	{
		
	}*/

}
