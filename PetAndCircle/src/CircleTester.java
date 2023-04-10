/**Class: CircleTester.java
* @author Anh Thu Nguyen
* @version 1.0
* Course : ITEC 2140-05 Fall 2021
* Written: Sep 26, 2021
*
* This class – This class will create circles and test the circle class
*/
import java.util.Scanner;

public class CircleTester
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the radius: ");
		double rad = sc.nextDouble();
		Circle myCircle1 = new Circle(rad); 
		System.out.println(myCircle1);
		System.out.println(String.format("%10s %.2f|%15s %.2f|%20s %.2f|", "Area: ", myCircle1.getArea(), "Diameter: ", myCircle1.getDiameter(), "Circumference: ", myCircle1.getCircumference()));
		
		Circle myCircle2 = new Circle(); 
		System.out.println(myCircle2);
		System.out.println(String.format("%10s %.2f|%15s %.2f|%20s %.2f|", "Area: ", myCircle2.getArea(), "Diameter: ", myCircle2.getDiameter(), "Circumference: ", myCircle2.getCircumference()));
		
		Circle myCircle3 = new Circle(1.5); 
		System.out.println(myCircle3);
		System.out.println(String.format("%10s %.2f|%15s %.2f|%20s %.2f|", "Area: ", myCircle3.getArea(), "Diameter: ", myCircle3.getDiameter(), "Circumference: ", myCircle3.getCircumference()));
		
		Circle myCircle4 = new Circle(4.7); 
		System.out.println(myCircle4);
		System.out.println(String.format("%10s %.2f|%15s %.2f|%20s %.2f|", "Area: ", myCircle4.getArea(), "Diameter: ", myCircle4.getDiameter(), "Circumference: ", myCircle4.getCircumference()));
		
		System.out.print("\nPlease enter the new radius: ");
		double rad2 = sc.nextDouble();
		myCircle1.setRadius(rad2);
		System.out.println(myCircle1);
		System.out.println(String.format("%10s %.2f|%15s %.2f|%20s %.2f|", "Area: ", myCircle1.getArea(), "Diameter: ", myCircle1.getDiameter(), "Circumference: ", myCircle1.getCircumference()));
		
		sc.close();
	}
}
