package ClassAssignment_8;

import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        System.out.println(intList);

        ArrayList<String> strList = new ArrayList<>();
        strList.add("red");
        strList.add("green");
        strList.add("blue");
        System.out.println(strList);
        System.out.println();

        ArrayList<Double> doubleList = new ArrayList<>();
        ArrayList<Character> charList = new ArrayList<>();

        String s1 = new String("red");
        String s2 = new String("red");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
    }

}
