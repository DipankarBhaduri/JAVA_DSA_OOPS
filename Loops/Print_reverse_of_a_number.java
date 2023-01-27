package Loops;

import java.util.Scanner;

public class Print_reverse_of_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverseNumber = reverse_Number(n);
        System.out.println(reverseNumber);
    }

    static int reverse_Number(int n) {
        int rev = 0;
        int rem = 0;

        while (n > 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        return rev;
    }
}