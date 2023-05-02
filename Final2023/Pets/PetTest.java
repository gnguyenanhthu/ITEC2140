package Pets;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PetTest {

    public static void main(String[] args) {

        Random rand = new Random(2150);
        int n = 10;

        List<Integer> yumiQuantities = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            yumiQuantities.add(rand.nextInt(2*n) - n);
        }
        System.out.println("Yumi: " + yumiQuantities);

        List<Integer> astroQuantities = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            astroQuantities.add(rand.nextInt(2*n) - n);
        }
        System.out.println("Astro: " + astroQuantities);
        System.out.println();

        // Your code starts here
        
        Cat yumi = new Cat("Yumi","David");
        System.out.println(yumi);
        yumi.talk();
        for (int i : yumiQuantities){
            yumi.work(i);
        }
        System.out.println(yumi);
        System.out.println();

        Dog astro = new Dog("Astro","Emily");
        System.out.println(astro);
        astro.talk();
        for (int i : astroQuantities){
            astro.work(i);
        }
        System.out.println(astro);
        System.out.println();


    }

}
