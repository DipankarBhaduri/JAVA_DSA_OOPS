package Converj_Drive_Preparation;

public class Find_Min_Element {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 8, 9, 0, 1, 2, 3 };
        int ans = minElement(arr);
        System.out.println("Answer : " + ans);
    }

    public static int minElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (arr[mid] > arr[mid + 1]) {
                return arr[mid + 1];
            }

            if (arr[start] < arr[mid] && arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return arr[start];
    }
}
