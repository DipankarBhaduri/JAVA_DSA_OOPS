package Array;

public class Right_Rotate {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = { 1, 2, 3, 4, 5 };
        int k = 2;

        Right_Rotated RR = new Right_Rotated();
        RR.rightRotate(arr, n, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

class Right_Rotated {

    public void rightRotate(int[] arr, int n, int k) {
        // write code here
        if (k == 0 || k == n) {
            return;
        } else {
            k = k % n;
            int[] helper = new int[arr.length];
            int start = n - k;
            int index = 0;
            while (start < n) {
                helper[index++] = arr[start++];
            }

            start = 0;
            while (start < n - k) {
                helper[index++] = arr[start++];
            }

            for (int i = 0; i < n; i++) {
                arr[i] = helper[i];
            }
        }
    }
}