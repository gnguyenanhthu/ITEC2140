/**Class: UserAge.java
* @author Anh Thu Nguyen
* @version 1.0
* Course : ITEC 2140-05 Fall 2021
* Written: Sep 16, 2021
*
* This class ask for user's name and age, print the name and age, followed by an "!" on one line.
*/
import java.util.Scanner;

public class UserAge
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String userName;
		int userAge;
		
		System.out.print("Enter name: ");
		userName = sc.nextLine();
		System.out.print("Enter age: ");
		userAge = sc.nextInt();
		System.out.print(userName + " is " + userAge + " years old!");
		sc.close();
	}
}
