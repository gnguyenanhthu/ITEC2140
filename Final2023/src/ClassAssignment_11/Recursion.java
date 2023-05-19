package ClassAssignment_11;

import java.io.File;

public class Recursion {

    public static long iterativeFactorial(int n) {
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }

    public static long factorial(int n) {
        // Base Case
        if (n == 0) {
            return 1;
        }

        // Recursive Step
        return n * factorial(n-1);
    }

    public static int iterativeSum(int[] arr, int start, int end) {
        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static int sum(int[] arr, int start, int end) {

        // Base Case
        if (start > end) {
            return 0;
        }

        // Recursive Step
        return arr[start] + sum(arr, start+1, end);

    }

    public static int sum(int[] arr) {
        return sum(arr, 0, arr.length - 1);
    }


    public static long size(File root) {

        // Base Case: The File object represents a file
        if (!root.isDirectory()) {
            return root.length();
        }

        // Recursive Step

        File[] children = root.listFiles();
        long size = 0;
        for (File child : children) {
            size += size(child);
        }

        return size;
    }

}
