package Stack;

import java.util.*;

public class Valid_Parenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        boolean b = isValid_Parenthesis(str);
        System.out.println(b);
    }

    static boolean isValid_Parenthesis(String str) {

        Stack<Character> stk = new Stack<>();
        if (str.length() % 2 != 0) {
            return false;
        } else {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == '(') {
                    stk.push(')');
                } else if (ch == '[') {
                    stk.push(']');
                } else if (ch == '{') {
                    stk.push('}');
                } else {
                    if (stk.size() != 0) {
                        if (stk.peek() == ch) {
                            stk.pop();
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
            }
        }

        if (stk.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
