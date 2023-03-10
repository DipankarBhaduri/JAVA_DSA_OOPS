package Array_2D;

import java.util.Scanner;

public class Find_Palindrome_in_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] a = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        String ans = findPalindrome(a, m, n);
        System.out.println(ans);
    }

    public static String findPalindrome(int[][] a, int m, int n) {

        String ans = "";

        for (int i = 0; i < m; i++) {
            int rowF = 0;
            int rowL = n - 1;
            while (rowF < rowL) {
                if (a[i][rowF] == a[i][rowL]) {
                    rowF++;
                    rowL--;
                } else {
                    break;
                }
            }

            if (n % 2 == 0 && rowL + 1 == rowF) {
                ans = i + " ROW";
                break;
            }

            if (n % 2 != 0 && rowL == rowF) {
                ans = i + " ROW";
                break;
            }
        }

        for (int i = 0; i < m; i++) {
            int colF = 0;
            int colL = m - 1;
            while (colF < colL) {
                if (a[colF][i] == a[colL][i]) {
                    colF++;
                    colL--;
                } else {
                    break;
                }
            }

            if (n % 2 == 0 && colL + 1 == colF) {
                ans = i + " COL";
                break;
            }

            if (n % 2 != 0 && colL == colF) {
                ans = i + " COL";
                break;
            }
        }

        return ans;
    }
}
