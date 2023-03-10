package Array_2D;

import java.util.Scanner;

public class Count_Negative_Numbers_in_a_Sorted_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        int[][] grid = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        }
        sc.close();
        System.out.println(countNegatives(grid));
    }

    public static int countNegatives(int[][] arr) {
        int count = 0;
        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i < m; i++) {
            if (arr[i][n - 1] < 0) {
                for (int j = n - 1; j >= 0; j--) {
                    int val = arr[i][j];
                    if (val < 0) {
                        count++;
                    } else {
                        break;
                    }
                }
            }
        }
        return count;
    }
}
