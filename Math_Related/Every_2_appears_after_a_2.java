package Math_Related;

import java.util.*;

public class Every_2_appears_after_a_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();
        System.out.print(next2(n, arr));
    }

    static boolean next2(int n, int[] arr) {
        int twoCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 2) {
                twoCount++;
            } else {
                if (twoCount == 1) {
                    return false;
                } else {
                    twoCount = 0;
                }
            }
        }

        if (twoCount < 2) {
            return false;
        } else {
            return true;
        }
    }
}
