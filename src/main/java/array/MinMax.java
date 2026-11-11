package array;

import java.util.Arrays;
import java.util.OptionalInt;

public class MinMax {
    private static void validate(int[] arr) {
        if (arr == null || arr.length == 0) throw new IllegalArgumentException("Invalid array");
    }

    public static int findMax(int[] arr) {
        validate(arr);
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    public static int findMin(int[] arr) {
        validate(arr);
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }

    public static int findMaxByStream(int[] arr) {
        validate(arr);
        OptionalInt result = Arrays.stream(arr).max();
        return result.orElseThrow();

    }

    public static int findMinByStream(int[] arr) {
        validate(arr);
        OptionalInt result = Arrays.stream(arr).min();
        return result.orElseThrow();
    }

    static void test(String label, int[] arr) {
        System.out.println("=== " + label + " ===");
        try {
            System.out.println("Max loop: " + findMax(arr));
        } catch (Exception ex) {
            System.out.println("Max loop: " + ex.getClass().getSimpleName());
        }
        try {
            System.out.println("Max by stream: " + findMaxByStream(arr));
        } catch (Exception ex) {
            System.out.println("Max by stream: " + ex.getClass().getSimpleName());
        }
        try {
            System.out.println("Min loop: " + findMin(arr));
        } catch (Exception ex) {
            System.out.println("Min loop: " + ex.getClass().getSimpleName());
        }
        try {
            System.out.println("Min by stream: " + findMinByStream(arr));
        } catch (Exception ex) {
            System.out.println("Min by stream: " + ex.getClass().getSimpleName());
        }
    }

    public static void main(String[] args) {
        String message = "A\uD83D\uDE0AB";
        System.out.println(message.length());
        System.out.println(message.charAt(0));
        System.out.println(message.charAt(message.length() - 1));

    }

}
