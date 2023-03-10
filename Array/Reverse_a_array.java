package Array;

public class Reverse_a_array {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9 };
        reverseArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverseArray(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while (start < end) {
            int first = arr[start];
            int last = arr[end];

            arr[start] = last;
            arr[end] = first;

            start++;
            end--;
        }
    }
}
