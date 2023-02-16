package Array;

import java.util.Scanner;

public class Find_The_Nearest_Supporter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int[] res = prevSmall(arr);
        for (int i = 0; i < res.length; i++)
            System.out.print(res[i] + " ");
        System.out.println();
        sc.close();
    }

    static int[] prevSmall(int[] row) {
        int ans[] = new int[row.length];
        int idx = 0;
        ans[idx++] = -1;

        for (int i = 1; i < row.length; i++) {
            int leftSmall = -1;
            for (int j = i - 1; j >= 0; j--) {
                if (row[j] < row[i]) {
                    leftSmall = row[j];
                    break;
                }
            }
            ans[idx++] = leftSmall;
        }
        return ans;
    }
}
