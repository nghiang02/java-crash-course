package string;

import java.util.concurrent.TimeUnit;

public class ConcatBenchmark {
    public static String concatPlus(int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
//            if (i > 0) result += ", ";
//            result += i;
            if (i == 0) {
                result += i;
                continue;
            }
            result += ", " + i;
        }
        return result;
    }

    public static void benchmark(int n) {
        System.out.print("n = " + n + " ");
        long start = System.nanoTime();
        String result = concatPlus(n);
        long ns = System.nanoTime() - start;
        System.out.print("length = " + result.length() + " ");
        System.out.println("time = " + TimeUnit.NANOSECONDS.toMillis(ns) + " ms");

    }

    public static void main(String[] args) {
        System.out.println("[" + concatPlus(4) + "]");
        System.out.println("[" + concatPlus(0) + "]");
        int[] sizes = {10_000, 20_000, 40_000, 80_000};
        for (int round = 1; round <= 2; round++) {
            System.out.println("Round " + round);
            for (int size : sizes) {
                benchmark(size);
            }
        }
    }
}
