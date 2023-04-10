/**Class: LoopsChallenges.java
* @author Anh Thu Nguyen
* @version 1.0
* Course : ITEC 2140-05 Fall 2021
* Written: Oct 5, 2021
*
* This class – now describe what the class does
*/

public class LoopsChallenges
{
	public static void main(String[] args)
	{
		//Adding 10 first integers [1,10]
		/*int total1 = 0;
		for (int i = 1; i <= 10; i++)
			total1 += i;
		System.out.println("Total of 10 first integers [1,10] = " + total1); */	
		
		//Adding 10 first even [2,20]
		/*int total2 = 0;
		for (int i = 2; i <= 20; i+=2)
			total2 += i;
		System.out.println("Total of 10 first even [2,20] = " + total2); */
		
		//Multiply 10 first integers [1,10]
		/*int total3 = 1;
		for (int i = 1; i <= 10; i++)
			total3 *= i;
		System.out.println("Multiply of 10 first integers [1,10] = " + total3);*/
		
		//SOP first 20 even numbers
		/*for (int i = 2; i <= 40; i+=2)
			System.out.println(i);*/
			
		//First 15 powers of 2 and sop
		for (int i = 0; i <= 14; i++)
			System.out.println((int)Math.pow(2, i));
		
	}
}
