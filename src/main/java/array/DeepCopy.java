package array;

import java.util.Arrays;
import java.util.List;

public class DeepCopy {

    public static int[][] deepCopy(int[][] src) {
        if (src == null) return null;
        int[][] copy = new int[src.length][];
        for (int row = 0; row < src.length; row++) {

            copy[row] = (src[row] == null) ? null : src[row].clone();

        }
        return copy;
    }

    public static void main(String[] args) {
        int[][] original = {{1, 2}, null, {5, 6}};

        int[][] copy = deepCopy(original);
        int[][] shallowCopy = Arrays.copyOf(original, original.length);
        original[0][1]= 3;
        copy[1][1]= 2;
        System.out.println(Arrays.deepToString(original));
        System.out.println(Arrays.deepToString(shallowCopy));

        System.out.println(Arrays.deepToString(copy));
    }
}
