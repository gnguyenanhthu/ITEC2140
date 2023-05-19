package ClassAssignment_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Shanghai");
        list.add("Boston");
        list.add("New York");
        list.add("Zurich");
        list.add("Atlanta");
        list.add("Bos");
        list.add("Atl");
        list.add("NYC");
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

    }
}
