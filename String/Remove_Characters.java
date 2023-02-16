package String;

import java.util.Scanner;

public class Remove_Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = removeChars(str);
        System.out.print(ans);
        sc.close();
    }

    public static String removeChars(String S) {
        // Write your code here
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (ch != 'a' && ch != 'c' && ch != 'i' && ch != 'o') {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
