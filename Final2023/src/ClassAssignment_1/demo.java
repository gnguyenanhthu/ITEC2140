package ClassAssignment_1;

import java.util.*;

public class demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        list.add("Alice");
        list.add("Bob");
        list.add("Carol");
        list.add("Daniel");
        System.out.println(list);
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (String s : list) {
            System.out.println(s);
        }

        list.remove(2);
        System.out.println(list);

        boolean female = true;
        String gender = female ? "Female" : "Male";
        System.out.println(gender);

        String gender2;
        if (female) {
            gender2 = "Female";
        }
        else {
            gender2 = "Male";
        }
        System.out.println(gender2);
    }
}
