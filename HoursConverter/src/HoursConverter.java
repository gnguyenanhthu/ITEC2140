/**Class: HoursConverter.java
* @author Anh Thu Nguyen
* @version 1.0
* Course : ITEC 2140-05 Fall 2021
* Written: Aug 26, 2021
*
* This program converts hours to weeks, days and hours
*/
import java.util.Scanner;

public class HoursConverter
{
	public static void main(String[] args) 
	{
	int numOfHours, numOfDays, remainHours, numOfWeeks, remainDays;
	final int HOURS_PER_DAY = 24, DAYS_PER_WEEK = 7;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of hours (int): ");
	numOfHours = sc.nextInt();
	
	//1 day = 24 hours
	numOfDays = numOfHours / HOURS_PER_DAY; //quotient
	remainHours = numOfHours % HOURS_PER_DAY; //remainder
	System.out.println(numOfHours + " hours is " + numOfDays + " days " + remainHours + " hours");
	
	//1 week = 7 days
	numOfWeeks = numOfDays / DAYS_PER_WEEK;
	remainDays = numOfDays % DAYS_PER_WEEK;
	System.out.println(numOfHours + " hours is " + numOfWeeks + " weeks " + remainDays + " days " + remainHours + " hours");

	sc.close();
	}
}
