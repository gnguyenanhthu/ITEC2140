/**Class: BackwardsNumbers.java
* @author Anh Thu Nguyen
* @version 1.0
* Course : ITEC 2140-05 Fall 2021
* Written: Aug 21, 2021
*
* This program will reverse user's input number
* Input a number 0 < number < 9999 -> output a backwards number
*/
import java.util.Scanner;

public class BackwardsNumbers
{
	public static void main(String[] args) 
	{
		int input, lastDigit, remainder;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input a number between 0 and 10000: ");
		input = sc.nextInt();
		System.out.println("Your input number: " + input);
		System.out.print("Your reverse number: ");
		
		//Example input 1234
		//1st last digit
		lastDigit = input % 10; //4
		remainder = input / 10; //123
		System.out.print(lastDigit);
		
		//2nd last digit
		lastDigit = remainder % 10; //3
		remainder = remainder / 10; //12
		System.out.print(lastDigit);
		
		//3rd last digit
		lastDigit = remainder % 10; //2
		System.out.print(lastDigit);
		
		//4th last digit
		lastDigit = remainder / 10; //1
		System.out.print(lastDigit);
		
		//Put into a loop (can use while remainder != 0 too)
		/*remainder = input; //initialize remainder
		for (int i = 0; i < 4; i++) //4 digits -> from 0 to 3 (4 times)
		{
			lastDigit = remainder % 10; //find last digit 4 -> 3 -> 2 -> 1
			remainder /= 10; //remainder 123 -> 12 -> 1
			System.out.print(lastDigit);
		}*/ 
		sc.close();
	}
}
