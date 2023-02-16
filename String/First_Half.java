package String;

import java.util.Scanner;

public class First_Half {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ans = firstHalf(str);
        System.out.print(ans);
        sc.close();
    }

    public static String firstHalf(String str) {
        // write code here
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length() / 2; i++) {
            char ch = str.charAt(i);
            sb.append(ch);
        }

        return sb.toString();
    }

}
