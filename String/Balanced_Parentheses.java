package String;

import java.util.Scanner;

public class Balanced_Parentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        boolean b = CanBalance(str);
        System.out.println(b);
        sc.close();
    }

    public static boolean CanBalance(String s) {
        // Write your code here

        if (s.length() % 2 != 0) {
            return false;
        }
        int openCount = 0;
        int closeCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                openCount++;
            }

            if (ch == ')') {
                closeCount++;
            }
        }

        if (openCount == closeCount) {
            return true;
        } else {
            return false;
        }
    }
}
