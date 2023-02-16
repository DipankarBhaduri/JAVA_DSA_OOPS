package Pattern_Printing;

import java.util.Scanner;

public class diamond_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);
        sc.close();
    }

    static void printPattern(int n) {

        // for fst half :-->>
        for (int i = 1; i <= n; i++) {
            // for space printing :-->>
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // for start printing :-->>
            for (int k = 1; k < 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // for second half :-->>
        for (int i = 1; i < n; i++) {
            // for space printing :-->>
            for (int j = n - i; j < n; j++) {
                System.out.print(" ");
            }

            // for start printing :-->>
            for (int k = 1; k < 2 * (n - i); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*

   *
  ***
 *****
*******
 *****
  ***
   *

   */