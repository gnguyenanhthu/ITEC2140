/**Class: Square.java
* @author Anh Thu Nguyen
* @version 1.0
* Course : ITEC 2140-05 Fall 2021
* Written: Sep 14, 2021
*
* This class – is a business class that describe a Square
* Class - a blueprint/template that contains
* the state and the behavior of an entity that is important to the system
*/

public class Square
{
	private double lengthOfSide; //this is my ONE instance attribute (variable)
	
	public Square() //creating an object of type Square with a side length of 1
	{
		lengthOfSide = 1;
	}
	
	public Square (double ls) //my job as coder is to set the values of the instance vars
	{
		lengthOfSide = ls;
	}
	
	public double getLengthOfSide()
	{
		return lengthOfSide;
	}
	
	public void setLengthOfSide(double newLengthOfSide)
	{
		lengthOfSide = newLengthOfSide;
	}
	
	public double computeArea()
	{
		return lengthOfSide * lengthOfSide;
	}
	
	public double computePerimeter()
	{
		return 4 * lengthOfSide;
	}
	
	public double computeDiagonal()
	{
		return lengthOfSide * Math.sqrt(2);
	}
	
	public double computeDoubleLength()
	{
		return 2 * lengthOfSide;
	}
	
	public String toString() 
	{ 
		String value = "Length is " + lengthOfSide; 
		return value; 
	} 
}
