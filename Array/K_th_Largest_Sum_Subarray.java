package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class K_th_Largest_Sum_Subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(kthLargestSum(arr, N, K));
    }

    public static int kthLargestSum(int arr[], int N, int K) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = i; j < N; j++) {
                sum += arr[j];
                list.add(sum);
            }
        }

        Collections.sort(list);
        int result = list.get(list.size() - K);
        return result;
    }
}
