/**Class: DayConverter.java
* @author Anh Thu Nguyen
* @version 1.0
* Course : ITEC 2140-05 Fall 2021
* Written: Aug 25, 2021
*
* This program will convert number of days, hours and minutes to minutes only
*/
import java.util.Scanner;


public class DayConverter
{
	public static void main(String[] args) 
	{
		int numOfDays, numOfHours, numOfMinutes, totalMinutes; 
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the number of days (int): ");
		numOfDays = sc.nextInt();
		System.out.print("Input the number of hours (int): ");
		numOfHours = sc.nextInt();
		System.out.print("Input the number of minutes (int): ");
		numOfMinutes = sc.nextInt();
		
		//1 day = 1440 mins, 1 hour = 60 mins
		totalMinutes = numOfDays * 1440 + numOfHours * 60 + numOfMinutes;
		System.out.print(numOfDays + " days, " + numOfHours + " hours and " + numOfMinutes + " minutes is " + totalMinutes + " minutes" );
		sc.close();
	}
}
