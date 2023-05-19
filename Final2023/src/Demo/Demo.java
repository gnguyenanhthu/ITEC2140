package Demo;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("alice");
        list.add("bob");
        list.add("carol");
        System.out.println(list);

        System.out.println(list.contains("alice"));
        System.out.println(list.contains("bob"));
        System.out.println(list.contains("carol"));
        System.out.println(list.contains("daniel"));
    }
}
