import java.util.Arrays;

/**Class: PastryTester.java
* @author Anh Thu Nguyen
* @version 1.0
* Course : ITEC 2140-05 Fall 2021
* Written: Nov 18, 2021
*
* This class – This class will store pastry and test the pastry class
*/

public class PastryTester
{
	public static void main(String[] args)
	{
		//1
		Pastry pastry_1 = new Pastry("cinnamon bun", 4.99, true);
		Pastry pastry_2 = new Pastry("doughnut, lemon curd", 3.99, false);
		Pastry pastry_3 = new Pastry("napoleon fill with custard fill fill", 6.99, true);
		Pastry pastry_4 = new Pastry("croissant FILL", 0.99, false);
		Pastry pastry_5 = new Pastry("fill Danish FILL pastry", 7.99, true);
		Pastry pastry_6 = new Pastry("Pâté Chaud", 1.99, false);
		
		//2 + 3
		System.out.println("My Pastry");
		System.out.println("Type is available: " + pastry_1.viewTypeIsAvailable(false));
		System.out.println("Type is available: " + pastry_6.viewTypeIsAvailable(true));
		
		//4
		Pastry[] myBoxOfPastries = new Pastry[6];
		myBoxOfPastries[0] = pastry_1;
		myBoxOfPastries[1] = pastry_2;
		myBoxOfPastries[2] = pastry_3;
		myBoxOfPastries[3] = pastry_4;
		myBoxOfPastries[4] = pastry_5;
		myBoxOfPastries[5] = pastry_6;
		
		//5
		System.out.println(Arrays.toString(myBoxOfPastries));
		
		//6
		double totalPrice = 0;
		for (int i = 0; i < myBoxOfPastries.length; i++)
		{
			totalPrice += myBoxOfPastries[i].getPrice();
		}
		System.out.println("Each pastry total: " + totalPrice);
		
		//7
		double countPremium = 0, boxbasedTotal = 0;
		for (int i = 0; i < myBoxOfPastries.length; i++)
		{
			if (myBoxOfPastries[i].getIsPremium())
				++countPremium;
		}
		if (countPremium >= 3)
			boxbasedTotal = 20.19;
		else
			boxbasedTotal = 5.99;
		System.out.println("Box-based total: " + boxbasedTotal);
		
		//8
		double purchasePrice = 0;
		if (boxbasedTotal >= totalPrice)
			purchasePrice = totalPrice;
		else
			purchasePrice = boxbasedTotal;
		System.out.println("Purchase Price: " + purchasePrice);
	}
}
