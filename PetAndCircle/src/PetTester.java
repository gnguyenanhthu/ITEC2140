/**Class: PetTester.java
* @author Anh Thu Nguyen
* @version 1.0
* Course : ITEC 2140-05 Fall 2021
* Written: Sep 25, 2021
*
* This class – This class will create pets and test the pet class
*/

import java.util.Scanner;

public class PetTester
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a name: ");
		String myPetName = sc.nextLine();
		System.out.print("Enter type of animal: ");
		String myPetType = sc.nextLine();
		System.out.print("Enter type of food: ");
		String myPetFood = sc.nextLine();
		
		Pet pet1 = new Pet();
		pet1.setName(myPetName);
		pet1.setAnimal(myPetType);
		pet1.setEats(myPetFood);
		
		Pet pet2 = new Pet();
		pet2.setName("Milk");
		pet2.setAnimal("Cat");
		pet2.setEats("Fish");
		
		Pet pet3 = new Pet();
		
		Pet pet4 = new Pet();
		pet4.setName("Bubble");
		pet4.setAnimal("Hamster");
		pet4.setEats("Cheese");
		
		Pet pet5 = new Pet();
		pet5.setName("Gongcha");
		pet5.setAnimal("Bird");
		pet5.setEats("Kibble");

		System.out.println("|-----^o^-----^o^-------MY PETS------^o^-----^o^-----|");
		System.out.println("|                                                    |");
		System.out.println(String.format("|%4s|%-15s|%-15s|%-15s|", "", "NAME", "ANIMAL", "EATS"));
		System.out.println(pet1);
		System.out.println(pet2);
		System.out.println(pet3);
		System.out.println(pet4);
		System.out.println(pet5);
		System.out.println("|                                                    |");
		System.out.println("|-----^o^-----^o^---------^o^--------^o^-----^o^-----|");

		sc.close();
	}
}
