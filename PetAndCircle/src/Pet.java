/**Class: Pet.java
* @author Anh Thu Nguyen
* @version 1.0
* Course : ITEC 2140-05 Fall 2021
* Written: Sep 25, 2021
*
* This class – This describe a pet at my vet business with:
* - name
* - animal
* - eats
*/

public class Pet
{
	private String name;
	private String animal;
	private String eats;
	
	public Pet()
	{
		name = "None";
		animal = "";
		eats = "";
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getAnimal()
	{
		return animal;
	}
	
	public String getEats()
	{
		return eats;
	}
	
	public void setName(String changedName)
	{
		name = changedName;
	}
	
	public void setAnimal(String changedAnimal)
	{
		animal = changedAnimal;
	}
	
	public void setEats(String changedEats)
	{
		eats = changedEats;
	}

	public String toString()
	{
		return String.format("|%4s|%-15s|%-15s|%-15s|", "", name, animal, eats);
	}
}
