package String;

import java.util.Scanner;

public class Remove_Consecutive_Duplicate_from_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ans = removeChars(str);
        System.out.println(ans);
    }

    public static String removeChars(String S) {
        // Write your code here
        StringBuilder sb = new StringBuilder("");
        int n = S.length();
        if (S.length() < 2) {
            return S;
        }

        char ch = S.charAt(0);
        sb.append(ch);
        for (int i = 1; i < n; i++) {
            char c = S.charAt(i);
            if (ch == c) {
                continue;
            } else {
                sb.append(c);
                ch = c;
            }
        }

        return sb.toString();
    }
}
