package Array_2D;

import java.util.*;

public class Maxima_Minima {
    public static int maximaMinima(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int ans = -1;
        for (int i = 0; i < m; i++) {
            int small = mat[i][0];
            int col = 0;
            for (int j = 0; j < n; j++) {
                if (mat[i][j] < small) {
                    small = mat[i][j];
                    col = j;
                }
            }

            for (int k = 0; k < mat.length; k++) {
                int val = mat[k][col];
                if (small <= val) {
                    break;
                }
                if (k == mat.length - 1) {
                    ans = small;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();
        int result = maximaMinima(matrix);
        System.out.println(result);
        sc.close();
    }
}
