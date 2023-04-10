/**Class: Cat.java
* @author Anh Thu Nguyen
* @version 1.0
* Course : ITEC 2140-05 Fall 2021
* Written: Sep 21, 2021
*
* This class – This describe a cat at my vet business with:
* - name
* - color
* - number of legs
* - year born
* Can also determine isGoodKitty
*/

public class Cat
{
	private String name;
	private String color;
	private int numbOfLegs;
	private int yearBorn;
	
	//2 constructors
	public Cat() //0 params
	{
		name = "TBD";
		color = "TBD";
		numbOfLegs = 4;
		yearBorn = 2021; //will work on as a date in a little while
	}
	
	public Cat (String newName, String newColor, int newNumbOfLegs, int newYearBorn)
	{
		name = newName;
		color = newColor;
		numbOfLegs = newNumbOfLegs;
		yearBorn = newYearBorn;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public int getnumbOfLegs()
	{
		return numbOfLegs;
	}
	
	public int getYearBorn()
	{
		return yearBorn;
	}
	
	public void setName(String changedName)
	{
		name = changedName;
	}
	
	public void setColor(String changedColor)
	{
		color = changedColor;
	}
	
	public void setNumbOfLegs(int changedNumbOfLegs)
	{
		numbOfLegs = changedNumbOfLegs;
	}
	
	public void setYearBorn(int changedYearBorn)
	{
		yearBorn = changedYearBorn;
	}
	
	public boolean isGoodKitty()
	{
		return (numbOfLegs <= 3 && name.toLowerCase().startsWith("t"));
	}
	
	public String toString()
	{
		//return "\n Name: " + name + " Color: " + color + " # of Legs: " + numbOfLegs + " Year Born: " + yearBorn;
		return String.format("|%12s|%30s|%3d|%4d", name, color, numbOfLegs, yearBorn);
	}
}
