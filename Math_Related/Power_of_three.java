package Math_Related;

import java.util.Scanner;

public class Power_of_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean b = powerOfThree(n);
        if (b) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        sc.close();
    }

    static boolean powerOfThree(int n) {
        if (n == 1 || n == 3) {
            return true;
        }

        int val = 3;

        while (val <= n) {
            val = val * val;
            if (val == n) {
                return true;
            }
        }

        return false;
    }
}
