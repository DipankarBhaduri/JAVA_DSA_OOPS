package Array;

import java.util.*;

public class Smallest_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String ans = smallestNumber(n, k);
        System.out.println(ans);
    }

    static String smallestNumber(int n, int k) {
        int ans = helper(n, k);
        String str = Integer.toString(ans);
        return str;

    }

    public static int helper(int n, int k) {
        for (int i = 0;; i++) {
            int[] ans = totalDigit(i);
            if (ans[0] == n && ans[1] == k) {
                return i;
            }
        }
    }

    public static int[] totalDigit(int num) {
        int d = 0;
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            d++;
            sum += rem;
            num = num / 10;
        }

        int[] arr = new int[2];
        arr[0] = d;
        arr[1] = sum;
        return arr;
    }
}

/*
 * 
 * Example 1
 * Input : 2 8
 * Output : 17
 * Explanation: N = 2 and K = 8.
 * All two-digit numbers whose sum of digits = 8 are [17, 26, 35, 44, 53, 62,
 * 71, 80]
 * The smallest two-digit number whose sum of digits = 8 is 17.
 * Example 2
 * Input : 3 1
 * Output: 100
 * Explanation: N = 3 and K = 1.
 * The smallest three-digit number whose sum of digits = 1 is 100.
 * 
 */