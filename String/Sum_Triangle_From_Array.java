package String;

import java.util.Scanner;

public class Sum_Triangle_From_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ans = Sum_Triangle(str);
        System.out.println(ans);
    }

    static String Sum_Triangle(String str) {
        if (str.length() == 2) {
            return str;
        }

        if (str.charAt(0) != str.charAt(1)) {
            return str.substring(0, 1) +
                    Sum_Triangle(str.substring(1, str.length()));
        } else {
            return Sum_Triangle(str.substring(1));
        }
    }
}
