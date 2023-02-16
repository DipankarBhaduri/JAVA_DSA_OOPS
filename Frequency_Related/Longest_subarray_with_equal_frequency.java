package Frequency_Related;

import java.util.*;

public class Longest_subarray_with_equal_frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int leng = longestSubarray(arr);
        System.out.println(leng);
        sc.close();
    }

    public static int longestSubarray(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int max = 0;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            if (set.contains(val)) {
                if (set.size() > max) {
                    max = set.size();
                }
                while (set.contains(val)) {
                    set.remove(arr[index++]);
                }
            }
            set.add(val);
        }
        return max;
    }
}
