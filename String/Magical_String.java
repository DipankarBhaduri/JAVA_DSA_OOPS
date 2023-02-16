package String;

import java.util.Scanner;

public class Magical_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = magicalString(str);
        System.out.println(result);
        sc.close();
    }

    static String magicalString(String S) {
        char[] ch = S.toCharArray();
        int length = ch.length;
        StringBuilder sb = new StringBuilder("");
        // a = 97 , z = 122 ;

        for (int i = 0; i < length; i++) {
            char c = ch[i];
            char after = 96 + ('z' - ((int) ch[i]));
            System.out.println(after);
        }

        return "";
    }
}
