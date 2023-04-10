/**Class: Pastry.java
* @author Anh Thu Nguyen
* @version 1.0
* Course : ITEC 2140-05 Fall 2021
* Written: Nov 18, 2021
*
* This class – This class contains pastry attributes such as
* type, price, premium
* and some methods
*/

public class Pastry
{
	private String type;
	private double price;
	private boolean isPremium;
	
	public Pastry(String newType, double newPrice, boolean newIsPremium)
	{
		this.type = newType;
		this.price = newPrice;
		this.isPremium = newIsPremium;
	}
	
	public String getType()
	{
		return this.type;
	}

	public void setType(String changedType)
	{
		this.type = changedType;
	}

	public double getPrice()
	{
		return this.price;
	}

	public void setPrice(double changedPrice)
	{
		this.price = changedPrice;
	}

	public boolean getIsPremium()
	{
		return this.isPremium;
	}

	public void setIsPremium(boolean changedIsPremium)
	{
		this.isPremium = changedIsPremium;
	}
	
	public boolean isFilled()
	{
		return this.type.toLowerCase().contains("fill");
	}
	
	public boolean isDoubleFilled()
	{
		int count = 0;
		String tempType = this.type.toLowerCase();
		for (int i = 0; i < this.type.length(); i++)
		{
			if (tempType.substring(i).startsWith("fill"))
				++count;
		}
		return (count >= 2);
	}
	
	public String viewTypeIsAvailable(boolean isAvailable)
	{
		if (isAvailable)
			return this.type + " filled";
		return this.type;
	}
	
	public String toString()
	{
		return "\nType: " + this.type + "\nPrice: $" + this.price + "\nIs premium:" + this.isPremium
				+ "\nIs filled: " + isFilled() + "\nIs double filled: " + isDoubleFilled() + "\n";
	}
}


