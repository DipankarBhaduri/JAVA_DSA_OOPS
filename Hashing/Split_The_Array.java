package Hashing;

import java.util.*;

public class Split_The_Array {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            String ans = splitArray(arr, n);
            System.out.println(ans);
        }
    }

    static String splitArray(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int val : arr) {
            if (map.containsKey(val)) {
                int temp = map.get(val);
                map.put(val, temp + 1);
            } else {
                map.put(val, 1);
            }
        }

        int freQ = map.get(arr[0]);
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() != freQ) {
                return "NO";
            }
        }

        return "YES";
    }
}
