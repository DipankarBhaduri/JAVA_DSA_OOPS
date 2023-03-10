package Array;

import java.util.Scanner;
import java.util.Stack;

public class Array_Subtracting {
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

        Stack<Integer> ans = subtract_two(arr1, arr2);

        while (!ans.isEmpty()) {
            System.out.println(ans.pop());
        }
    }

    public static Stack<Integer> subtract_two(int[] arr1, int[] arr2) {
        int n1 = arr1.length - 1;
        int n2 = arr2.length - 1;

        Stack<Integer> stk = new Stack<>();
        int carry = 0;

        while (n1 >= 0 && n2 >= 0) {

            int num1 = arr1[n1];
            int num2 = arr2[n2];

            if (carry == 1) {
                num1 -= 1;
                carry = 0;
            }

            if (num1 >= num2) {
                stk.push(num1 - num2);
                n1--;
                n2--;
            } else {
                if (n1 != 0) {
                    num1 += 10;
                    carry = 1;
                    stk.push(num1 - num2);
                }
            }
        }
    }
}
