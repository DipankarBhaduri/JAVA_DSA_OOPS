package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class Valid_Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        boolean b = check_anagram(s, t);
        System.out.println(b);
    }

    static boolean check_anagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (map.containsKey(ch)) {
                int temp = map.get(ch);
                if (temp == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, temp - 1);
                }
            } else {
                return false;
            }
        }

        if (map.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
