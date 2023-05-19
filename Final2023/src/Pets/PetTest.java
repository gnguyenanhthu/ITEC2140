package Pets;

import java.util.ArrayList;

public class PetTest {
    public static void main(String[] args) {
        Cat garfield = new Cat("Garfield");
        System.out.println(garfield);
        garfield.talk();
        Dog scooby = new Dog("Scooby");
        System.out.println(scooby);
        scooby.talk();

        ArrayList<Pet> pets = new ArrayList<>();
        pets.add(garfield);
        pets.add(scooby);
        pets.add(new Cat("Tom"));
        pets.add(new Dog("Clifford"));
        System.out.println(pets);

        for (Pet pet : pets) {
            System.out.println(pet);
            pet.talk();
        }

    }

}
