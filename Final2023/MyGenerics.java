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


    public static <T> void swap(T[] arr, int i, int j) {
        if (i < 0 || i >= arr.length || j < 0 || j >= arr.length) {
            throw new ArrayIndexOutOfBoundsException("Index of bound");
        }

        T aux = arr[i];
        arr[i] = arr[j];
        arr[j] = aux;
    }


    public static <T> void reverse(T[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            swap(arr, left, right);
            left += 1;
            right -= 1;
        }
    }


    public static <T extends Comparable<? super T>> T maxElement(T[] arr) {
        T max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }

        return max;
    }


    public static <T> ArrayList<T> shallowCopy(ArrayList<T> list) {
        ArrayList<T> copy = new ArrayList<>();
        for (T x : list) {
            copy.add(x);
        }

        return copy;
    }


}
