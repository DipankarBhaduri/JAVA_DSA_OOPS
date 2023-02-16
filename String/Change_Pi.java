package String;

import java.util.Scanner;

public class Change_Pi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(Solution.changePi(str));
    }
}

class Solution {

    public static String changePi(String str) {
        if (str.length() < 2) {
            return str;
        }

        if (str.substring(0, 2).equals("pi")) {
            return "3.14" + changePi(str.substring(2));
        } else {
            return str.substring(0, 1) + changePi(str.substring(1));
        }
    }
}
