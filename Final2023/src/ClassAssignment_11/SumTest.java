package ClassAssignment_11;

import java.util.Arrays;
import java.util.Random;

public class SumTest {

    public static void main(String[] args) {
        int n = 100;
        Random rand = new Random();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(n);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Recursion.iterativeSum(arr, 30, 60));
        System.out.println(Recursion.sum(arr, 30, 60));
    }

}
