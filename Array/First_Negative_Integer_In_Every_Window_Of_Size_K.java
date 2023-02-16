package Array;

import java.util.LinkedList;
import java.util.*;
import java.util.Scanner;

public class First_Negative_Integer_In_Every_Window_Of_Size_K {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[] ans = (Solution.printFirstNegativeInteger(arr, n, k));
        for (int i = 0; i < ans.length; ++i) {
            System.out.print(ans[i] + " ");
        }
    }
}

class Solution {
    public static int[] printFirstNegativeInteger(int arr[], int n, int k) {
        int[] ans = new int[n - k + 1];
        int index = 0;
        Queue<Integer> q = new LinkedList<>();
        int end;
        for (end = 0; end < k; end++) {
            q.add(arr[end]);
        }

        int temp = helper(q);
        ans[index++] = temp;

        for (end = k; end < n; end++) {
            q.remove();
            q.add(arr[end]);
            Queue<Integer> QQ = q;
            temp = helper(QQ);
            ans[index++] = temp;
        }
        return ans;
    }

    static int helper(Queue<Integer> q) {
        int ans = 0;
        Queue<Integer> help = new LinkedList<>();
        while (!q.isEmpty()) {
            int num = q.remove();
            help.add(num);
            if (num < 0) {
                ans = num;
                break;
            }
        }

        while (!q.isEmpty()) {
            int num = q.remove();
            help.add(num);
        }

        while (!help.isEmpty()) {
            q.add(help.remove());
        }
        return ans;
    }
}
