package LinkedList;

import java.util.HashSet;
import java.util.Scanner;

public class Remove_Duplicates {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
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

    static void print_info(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    static Node remove_duplicate(Node head) {
        HashSet<Integer> set = new HashSet<>();
        Node curr = head;
        while (curr.next != null) {
            set.add(curr.data);

            if (set.contains(curr.next.data)) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList LL_1 = new LinkedList();
        Node root = null;
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int temp = sc.nextInt();
            root = LL_1.add_last(temp);
        }

        Node ans = remove_duplicate(root);
        print_info(ans);
    }
}
