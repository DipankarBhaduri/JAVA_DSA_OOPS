package Array_2D;

import java.util.Scanner;

public class Max_Sum_of_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int ans = maxSum(arr, m, n);
        System.out.println(ans);
    }

    public static int maxSum(int[][] mat, int m, int n) {
        int rowMax = 0;
        int colMax = 0;

        // Find out rowMax from each rows :)
        for (int i = 0; i < m; i++) {
            int sum = 0;
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < n; j++) {
                sum += mat[i][j];

                max = Math.max(max, sum);

                if (sum < 0) {
                    sum = 0;
                }
            }

            rowMax += max;
        }

        // Find out Column max From every Column :)
        for (int i = 0; i < n; i++) {
            int sum = 0;
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < m; j++) {
                sum += mat[j][i];

                max = Math.max(max, sum);

                if (sum < 0) {
                    sum = 0;
                }
            }

            colMax += max;
        }

        return Math.max(rowMax, colMax);

    }
}
