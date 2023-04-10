/**Class: CatTester.java
* @author Anh Thu Nguyen
* @version 1.0
* Course : ITEC 2140-05 Fall 2021
* Written: Sep 21, 2021
*
* This class – This class will create cats and test the cat class
*/

public class CatTester
{
	public static void main(String[] args)
	{
		//new is special keywords to construct an object
		Cat cat0 = new Cat();
		cat0.setName("Marmalade");
		cat0.setNumbOfLegs(5);
		cat0.setColor("orange");
		cat0.setYearBorn(2001);
		
		Cat cat1 = new Cat("Snoot", "tortie", 4, 2018);
		
		Cat cat2 = new Cat("Tootsie", "black and white spottted", 2, 2016);
		Cat cat3 = new Cat("tracy", "grey tiger", 3, 2014);
		System.out.println("---------------CATS------------");
		System.out.println(cat0); //System.out.println(" Good Kitty: "+ cat0.isGoodKitty());
		System.out.println(cat1); //System.out.println(" Good Kitty: "+ cat1.isGoodKitty());
		System.out.println(cat2); //System.out.println(" Good Kitty: "+ cat2.isGoodKitty());
		System.out.println(cat3); //System.out.println(" Good Kitty: "+ cat3.isGoodKitty());

	}
}
