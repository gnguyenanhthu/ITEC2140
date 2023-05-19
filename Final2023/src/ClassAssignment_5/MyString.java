package ClassAssignment_5;

import java.util.ArrayList;
import java.util.Collections;

public class MyString implements Comparable<MyString> {
    private String str;

    public MyString(String str) {
        this.str = str;
    }

    @Override
    public int compareTo(MyString o) {
        if (this.str.length() != o.str.length()) {
            return this.str.length() - o.str.length();
        }
        else {
            return this.str.compareTo(o.str);
        }
    }

    @Override
    public String toString() {
        return str;
    }

    public static void main(String[] args) {
        ArrayList<MyString> list = new ArrayList<>();

        list.add(new MyString("red"));
        list.add(new MyString("green"));
        list.add(new MyString("blue"));
        list.add(new MyString("black"));
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
