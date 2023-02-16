package LinkedList;

import java.util.ArrayList;
import java.util.Scanner;

public class Odd_Even_Linked_List {

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

    static void Print_Odd_Even(Node head) {
        Node curr = head;
        ArrayList<Integer> list = new ArrayList<>();
        while (curr != null) {
            list.add(curr.data);
            curr = curr.next;
        }

        for (int i = 0; i < list.size(); i = i + 2) {
            System.out.print(list.get(i) + " ");
        }

        for (int i = 1; i < list.size(); i = i + 2) {
            System.out.print(list.get(i) + " ");
        }

    }

    static void print_info(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList LL = new LinkedList();
        Node root = null;

        int t = sc.nextInt();
        while (t > 0) {

            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                int temp = sc.nextInt();
                root = LL.add_last(temp);
            }

            Print_Odd_Even(root);
            System.out.println();

            t--;
        }
    }
}
