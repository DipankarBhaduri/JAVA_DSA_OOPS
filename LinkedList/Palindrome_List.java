package LinkedList;

import java.util.*;

public class Palindrome_List {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LL {
        Node head;

        public Node add_last(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return head;
            }

            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }

            curr.next = newNode;
            return head;
        }
    }

    static boolean check_palindrome(Node head) {
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.data);
            head = head.next;
        }

        int start = 0;
        int end = list.size() - 1;
        while (start < end) {
            if (list.get(start) != list.get(end)) {
                return false;
            } else {
                start++;
                end--;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LL ll = new LL();
        Node root = null;
        for (int i = 1; i <= n; i++) {
            root = ll.add_last(sc.nextInt());
        }

        boolean b = check_palindrome(root);
        System.out.println(b);
    }
}
