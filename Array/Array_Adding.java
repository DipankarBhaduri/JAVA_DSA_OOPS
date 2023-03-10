package Array;

import java.util.Scanner;
import java.util.Stack;

public class Array_Adding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        Stack<Integer> ans = addTwoArray(arr1, arr2);
        while (!ans.isEmpty()) {
            System.out.println(ans.pop());
        }
    }

    public static Stack<Integer> addTwoArray(int[] arr1, int[] arr2) {
        int n1 = arr1.length - 1;
        int n2 = arr2.length - 1;
        int carry = 0;

        Stack<Integer> stk = new Stack<>();
        while (n2 >= 0 && n1 >= 0) {
            int num = arr1[n1] + arr2[n2] + carry;
            stk.push(num % 10);
            carry = num / 10;
            n1--;
            n2--;
        }

        while (n2 >= 0) {
            int num = arr2[n2] + carry;
            stk.push(num % 10);
            carry = num / 10;
            n2--;
        }

        while (n1 >= 0) {
            int num = arr1[n1] + carry;
            stk.push(num % 10);
            carry = num / 10;
            n1--;
        }

        if (carry != 0) {
            stk.push(carry);
        }

        return stk;
    }
}
