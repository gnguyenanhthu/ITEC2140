/**Class: Fruit.java
* @author Anh Thu Nguyen
* @version 1.0
* Course : ITEC 2140-05 Fall 2021
* Written: Oct 21, 2021
*
* This class – This class contains fruits attributes such as
* name, description, number of calories
* 3 custom methods: isStarchy, isNumberedDescription, numberOfFruits
*/

public class Fruit
{
	private String name;
	private String description;
	private int numberOfCalories;
	
	public Fruit(String newName, String newDescription, int newCalories)
	{
		this.name = newName;
		this.description = newDescription;
		this.numberOfCalories = newCalories;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getDescription()
	{
		return this.description;
	}
	
	public int getNumberOfCalories()
	{
		return this.numberOfCalories;
	}
	
	public void setName(String changedName)
	{
		this.name = changedName;
	}
	
	public void setDescription(String changedDescription)
	{
		this.description = changedDescription;
	}
	
	public void setNumberOfCalories(int changedNumberOfCalories)
	{
		this.numberOfCalories = changedNumberOfCalories;
	}
	
	public boolean isStarchy(boolean isEatenWithFat)
	{
		return (isEatenWithFat && this.numberOfCalories > 300 && this.description.toLowerCase().contains("sweet"));
	}
	
	public boolean isNumberedDescription()
	{
		return Character.isDigit(this.description.charAt(0));
	}
	
	public int numberOfFruits()
	{
		return 1600/this.numberOfCalories;
	}
	
	public String toString()
	{
		return "\nFruit name: " + this.name + "\nDescription: " + this.description + "\nNumber of Calories: " + this.numberOfCalories
				+ "\nIs numbered description: " + isNumberedDescription() + "\nNumber of fruits may be eaten: " + numberOfFruits();
	}
	
	
}
