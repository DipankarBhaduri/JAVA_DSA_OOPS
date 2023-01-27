package Array;

// Frute force solution :-->>
public class Max_Subarray_sum {
    public static void main(String[] args) {
        int[] arr = { 1, -2, 6, -1, 3 };
        bruteForceSolution BFS = new bruteForceSolution();
        int maxSum = BFS.max_Sum_of_subarray(arr);
        System.out.println(maxSum);
        System.out.println("______________________________");

    }
}

// Frute force solution :-->>
class bruteForceSolution {
    int max_Sum_of_subarray(int[] arr) {
        int maxSum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int temp = 0;
            for (int j = i + 1; j < arr.length; j++) {
                temp += arr[j];
            }
            maxSum = Math.max(maxSum, temp);
        }
        return maxSum;
    }
}
