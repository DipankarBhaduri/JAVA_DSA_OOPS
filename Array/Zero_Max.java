package Array;

import java.util.Scanner;

public class Zero_Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        zeroMax(n, arr);
    }

    public static void zeroMax(int n, int[] arr) {
        // write code here
        int ref[] = new int[n];
        int temp = 0;

        for (int i = n - 1; i >= 0; i--) {
            int val = arr[i];
            if (val % 2 != 0) {
                if (val > temp) {
                    temp = val;
                }
            }

            if (val == 0) {
                ref[i] = temp;
            }
        }

        int[] res = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                if (ref[i] == 0) {
                    res[index++] = arr[i];
                    // System.out.print(arr[i] + " ");
                } else {
                    res[index++] = ref[i];
                    // System.out.print(ref[i] + " ");
                }
            } else {
                res[index++] = arr[i];
                // System.out.print(arr[i] + " ");
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = res[i];
        }
    }
}
