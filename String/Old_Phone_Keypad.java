package String;

import java.util.ArrayList;
import java.util.Scanner;

public class Old_Phone_Keypad {
    static ArrayList<String> OldPhone(int n, int[] keys) {
        ArrayList<Character>[] arr = new ArrayList[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = new ArrayList<>();
        }

        arr[1].add('A');
        arr[1].add('B');
        arr[1].add('C');

        arr[2].add('D');
        arr[2].add('E');
        arr[2].add('F');

        arr[3].add('G');
        arr[3].add('H');
        arr[3].add('I');

        arr[4].add('J');
        arr[4].add('K');
        arr[4].add('L');

        arr[5].add('M');
        arr[5].add('N');
        arr[5].add('O');

        arr[6].add('P');
        arr[6].add('Q');
        arr[6].add('R');

        arr[7].add('S');
        arr[7].add('T');
        arr[7].add('U');

        arr[8].add('V');
        arr[8].add('W');
        arr[8].add('X');

        arr[9].add('Y');
        arr[9].add('Z');

    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] keys = new int[n];
        for (int i = 0; i < n; ++i) {
            keys[i] = sc.nextInt();
        }
        ArrayList<String> ans = OldPhone(n, keys);
        for (String i : ans)
            System.out.print(i + " ");
    }
}
