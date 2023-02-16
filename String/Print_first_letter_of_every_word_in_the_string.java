package String;

import java.util.Scanner;

public class Print_first_letter_of_every_word_in_the_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = firstAlphabet(str);
        System.out.println(result);
        sc.close();

    }

    static String firstAlphabet(String S) {
        // code here
        int n = S.length();
        boolean flag = true;
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < n; i++) {
            char ch = S.charAt(i);
            if (flag) {
                sb.append(ch);
                flag = false;
            }

            if (ch == ' ') {
                flag = true;
            }
        }

        return sb.toString();
    }
}
