package Array;

import java.io.*;
import java.util.*;

public class Students_Performance_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        // Solution Obj = new Solution();
        int[] result = solve(arr1);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] solve(int[] arr) {
        int[] ans = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int temp = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    temp = j - i;
                    break;
                }
            }
            ans[index++] = temp;
        }
        ans[index] = -1;
        return ans;
    }
}