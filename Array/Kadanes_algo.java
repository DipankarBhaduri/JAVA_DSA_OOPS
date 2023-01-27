package Array;

public class Kadanes_algo {
    public static void main(String[] args) {
        int[] arr = { 1, -2, 6, -1, 3 };
        int[] arr1 = { -2, -3, 4, -1, -2, 1, 5, -3 };
        Kadanes KA = new Kadanes();
        int maxSum = KA.max_Sum_of_subarray(arr1);
        System.out.println(maxSum);
    }
}

// Kadanes_algo solution :-->>
class Kadanes {
    int max_Sum_of_subarray(int[] arr) {
        int maxSum = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            temp += arr[i];
            if (temp < 0) {
                temp = 0;
            }
            maxSum = Math.max(maxSum, temp);
        }
        return maxSum;
    }
}
