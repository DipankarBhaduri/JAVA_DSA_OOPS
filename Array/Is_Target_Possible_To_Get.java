package Array;

import java.io.*;
import java.util.*;

public class Is_Target_Possible_To_Get {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(targetSum(0, arr, target));
        sc.close();
    }

    public static boolean targetSum(int start, int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            num += nums[i];
            if (set.contains(target - nums[i])) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
