package Array;

import java.util.Scanner;

public class Number_Rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        sc.close();
        int result = Number_Rotation(n, k);
        System.out.println(result);
    }

    public static int Number_Rotation(int n, int k) {
        int temp = n;
        int count = 0;
        int index = 0;

        while (temp > 0) {
            int rem = temp % 10;
            count++;
            temp = temp / 10;
        }

        int[] arr = new int[count];
        int[] ans = new int[count];
        int idx = count - 1;
        temp = n;

        while (temp > 0) {
            arr[idx--] = temp % 10;
            temp = temp / 10;
        }

        if (count == k) {
            return n;
        }

        if (k > count || k > 0) {
            k = k % count;

            for (int i = count - k; i < count; i++) {
                ans[index++] = arr[i];
            }

            for (int i = 0; i < count - k; i++) {
                ans[index++] = arr[i];
            }

        }

        if (k < 0) {
            k = k % count;
            int lim = count - (k + count);
            for (int i = lim; i < count; i++) {
                ans[index++] = arr[i];
            }

            for (int i = 0; i < lim; i++) {
                ans[index++] = arr[i];
            }
        }

        int resultant = 0;
        int v = 0;
        while (v < count) {
            resultant = resultant * 10 + ans[v++];
        }

        return resultant;
    }
}
