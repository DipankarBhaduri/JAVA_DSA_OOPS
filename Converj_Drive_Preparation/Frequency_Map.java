package Converj_Drive_Preparation;

import java.util.HashMap;
import java.util.Map;

public class Frequency_Map {
    public static void main(String[] args) {
        String str = "Baranagarkolkata";
        HashMap<Character, Integer> map = calculateFrequesncy(str);
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }

    public static HashMap<Character, Integer> calculateFrequesncy(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if (map.containsKey(ch)) {
                int val = map.get(ch);
                map.put(ch, val + 1);
            } else {
                map.put(ch, 1);
            }
        }
        return map;
    }
}
