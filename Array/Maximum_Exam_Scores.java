package Array;

import java.util.*;

public class Maximum_Exam_Scores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++)
            arr1[i] = sc.nextInt();
        int k = sc.nextInt();
        Solution1 Obj = new Solution1();
        Obj.printMax(arr1, n, k);
        System.out.println('\n');
    }
}

class Solution1 {
    public static void printMax(int arr[], int n, int k) {
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

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    static int helper(Queue<Integer> q) {
        int ans = 0;
        Queue<Integer> help = new LinkedList<>();
        while (!q.isEmpty()) {
            int num = q.remove();
            help.add(num);
            if (num > ans) {
                ans = num;
            }
        }
        while (!help.isEmpty()) {
            q.add(help.remove());
        }
        return ans;
    }
}