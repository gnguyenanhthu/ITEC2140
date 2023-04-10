/**Class: FruitTester.java
* @author Anh Thu Nguyen
* @version 1.0
* Course : ITEC 2140-05 Fall 2021
* Written: Oct 21, 2021
*
* This class – This class will store fruits and test the fruit class
*/

public class FruitTester
{
	public static void main(String[] args)
	{
		Fruit fruit_1 = new Fruit("Strawberry", "A strawberry from Da Lat is sweet and sour", 300);
		Fruit fruit_2 = new Fruit("Apple", "!!!No pesticide, very sweet", 650);
		Fruit fruit_3 = new Fruit("Mango", "100% fresh", 125);
		Fruit fruit_4 = new Fruit("Cherry", "Check if this is a yummy cherry", 900);
		fruit_4.setDescription("100 times better than strawberries");

		System.out.println("FRUIT STORAGE");
		System.out.print(fruit_1); System.out.println("\nStarchy: " + fruit_1.isStarchy(false));
		System.out.print(fruit_2); System.out.println("\nStarchy: " + fruit_2.isStarchy(true));
		System.out.println(fruit_3);
		System.out.println(fruit_4);
	}
}
