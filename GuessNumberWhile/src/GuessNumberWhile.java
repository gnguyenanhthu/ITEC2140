/**Class: GuessNumberWhile.java
* @author Anh Thu Nguyen
* @version 1.0
* Course : ITEC 2140-05 Fall 2021
* Written: Oct 5, 2021
*
* This class – now describe what the class does
*/

import java.util.Random;
import java.util.Scanner;

public class GuessNumberWhile
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int secretNumber = ran.nextInt(101); //random number [0,100]
		int guessNumber;
		boolean hasWon = false;
		System.out.println("Try guessing the secret number!");
		
		
		while (!hasWon)
		{
			System.out.print("Guess a number between 0 and 100: ");
			guessNumber = sc.nextInt();
			int difference = Math.abs(guessNumber - secretNumber);
			if (guessNumber > secretNumber)
			{
				System.out.println("Guess is too high, guess again!");
				if (difference <= 5) System.out.println("But you are close!");
			}
			else if (guessNumber < secretNumber)
			{
				System.out.println("Guess is too low, guess again!");
				if (difference <= 5) System.out.println("But you are close!");
			}
			else if (guessNumber == secretNumber)
			{
				System.out.print("Winner winner chicken dinner!!");
				hasWon = true;
			}				
		}
		sc.close();
	}
}
