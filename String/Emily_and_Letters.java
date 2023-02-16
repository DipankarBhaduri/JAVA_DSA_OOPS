package String;

import java.util.HashMap;
import java.util.Scanner;

public class Emily_and_Letters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int ans = firstUniqChar(str);
        System.out.print(ans);
        sc.close();
    }

    public static int firstUniqChar(String s) {
        // Write your code here

        HashMap<Character, Integer> map = new HashMap<>();
        // Friquency storing into the hashmap :-->>
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                int val = map.get(ch);
                map.put(ch, val + 1);
            }
        }

        int index = -1;
        // Finding the first non repeating character :-->>
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.get(ch) == 1) {
                index = i;
                break;
            }
        }

        return index;
    }
}
