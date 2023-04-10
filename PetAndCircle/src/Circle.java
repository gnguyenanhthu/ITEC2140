/**Class: Circle.java
* @author Anh Thu Nguyen
* @version 1.0
* Course : ITEC 2140-05 Fall 2021
* Written: Sep 26, 2021
*
* This class – Is a business class that describes a Circle
*/

public class Circle
{
	private double radius;
	
	public Circle()
	{
		radius = 0;
	}
	
	public Circle(double newRadius)
	{
		radius = newRadius;
	}
	
	public void setRadius(double changedRadius)
	{
		radius = changedRadius;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double getArea()
	{
		return 3.14 * radius * radius;
	}
	
	public double getDiameter()
	{
		return radius * 2;
	}
	
	public double getCircumference()
	{
		return 2 * 3.14 * radius;
	}
	
	public String toString()
	{
		return "\nRadius is " + radius;
	}
}
