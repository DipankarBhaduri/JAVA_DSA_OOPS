package Mathematics;

import java.util.HashSet;
import java.util.Scanner;

public class Is_Target_Possible_To_Get {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Boolean b = isTargetPossible(arr, target);
        System.out.println(b);
    }

    public static boolean isTargetPossible(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            if (target == arr[i]) {
                return true;
            }
            if (set.contains(target - arr[i])) {
                return true;
            } else {
                sum += arr[i];
                if (!set.contains(sum)) {
                    set.add(sum);
                }
                set.add(arr[i]);
            }

        }
        return false;
    }
}
