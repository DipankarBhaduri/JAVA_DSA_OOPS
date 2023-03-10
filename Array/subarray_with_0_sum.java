package Array;

import java.util.HashSet;

public class subarray_with_0_sum {
    public static void main(String[] args) {
        int Input[] = { 3, 4, -8, 12 };
        boolean b = subarrayWithZeroSum(Input);
        System.out.println(b);
    }

    public static boolean subarrayWithZeroSum(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        int sum = 0;
        for (int val : arr) {

            sum += val;
            if (set.contains(sum)) {
                return true;
            }

            set.add(sum);
        }

        return false;
    }
}
