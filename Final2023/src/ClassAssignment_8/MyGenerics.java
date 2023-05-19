package ClassAssignment_8;

import java.util.ArrayList;

public class MyGenerics {

    public static <T> ArrayList<Integer> findIndices(ArrayList<T> list, T target) {
        ArrayList<Integer> indices = new ArrayList<>();

        for (int index = 0; index < list.size(); index++) {
            if (target.equals(list.get(index))) {
                indices.add(index);
            }
        }

        return indices;
    }

    public static <T> int firstIndex(ArrayList<T> list, T target) {
        for (int index = 0; index < list.size(); index++) {
            if (target.equals(list.get(index))) {
                return index;
            }
        }

        return -1;
    }

    public static <T> int lastIndex(ArrayList<T> list, T target) {
        for (int index = list.size() - 1; index >= 0; index--) {
            if (target.equals(list.get(index))) {
                return index;
            }
        }

        return -1;
    }

    public static <T> boolean contains(ArrayList<T> list, T target) {
        return firstIndex(list, target) != -1;
    }
    

}
