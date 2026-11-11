package array;

import java.util.Arrays;
import java.util.List;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<int[]> wrong = Arrays.asList(nums);
        System.out.println(wrong.size());   // ?
        System.out.println(wrong);          // ? Sẽ in ra kiểu [[I@1b6d3586. Vì sao?

        Integer[] boxed = {1, 2, 3};
        List<Integer> ok = Arrays.asList(boxed);
        System.out.println(ok.size());      // ?
    }
}
