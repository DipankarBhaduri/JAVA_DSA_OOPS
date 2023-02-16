package Lowes_Drive_Preparation;

import java.util.ArrayList;
import java.util.HashSet;

public class LinkedList_Practice_Qs {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Linked List class
    static class LL {
        Node head;

        public Node buildLinkedList(Node head, int value) {
            if (head == null) {
                head = new Node(value);
                return head;
            }

            Node newNode = new Node(value);

            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
            return head;
        }
    }

    // Print the Nodes
    static void print_info(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    // Marge two LinkedList
    static Node margedLinkedList(Node head1, Node head2) {
        Node ans = new Node(0);
        Node track = ans;

        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                ans.next = head1;
                head1 = head1.next;
                ans = ans.next;
            } else {
                ans.next = head2;
                head2 = head2.next;
                ans = ans.next;
            }
        }

        while (head1 != null) {
            ans.next = head1;
            head1 = head1.next;
            ans = ans.next;
        }

        while (head2 != null) {
            ans.next = head2;
            head2 = head2.next;
            ans = ans.next;
        }

        return track.next;
    }

    // Reverse a linked list
    static Node reversedLinkedList(Node head) {
        Node pre = null;
        while (head != null) {
            Node next = head.next;

            head.next = pre;
            pre = head;
            head = next;
        }

        return pre;
    }

    // addition of two LinkedList
    static Node additionOfLinkedList(Node head1, Node head2) {
        Node first = reversedLinkedList(head1);
        Node second = reversedLinkedList(head2);

        Node newNode = new Node(0);
        Node track = newNode;
        int carry = 0;

        while (first != null && second != null) {
            int sum = first.data + second.data + carry;
            Node curr = new Node(sum % 10);
            newNode.next = curr;
            newNode = newNode.next;
            carry = sum / 10;
            first = first.next;
            second = second.next;
        }

        while (first != null) {
            int sum = first.data + carry;
            Node curr = new Node(sum % 10);
            newNode.next = curr;
            newNode = newNode.next;
            carry = sum / 10;
            first = first.next;
        }

        while (second != null) {
            int sum = second.data + carry;
            Node curr = new Node(sum % 10);
            newNode.next = curr;
            newNode = newNode.next;
            carry = sum / 10;
            second = second.next;
        }

        if (carry != 0) {
            Node curr = new Node(carry);
            newNode.next = curr;
        }

        Node ans = reversedLinkedList(track.next);
        return ans;
    }

    // Remove Duplicates From Unsorted Linked List
    static Node removeDuplicateFromUnsorted(Node head) {
        HashSet<Integer> set = new HashSet<>();
        Node curr = head;

        while (curr.next != null) {
            set.add(curr.data);
            if (!set.contains(curr.next.data)) {
                curr = curr.next;
            } else {
                curr.next = curr.next.next;
            }
        }

        return head;
    }

    // Remove Duplicates From sorted Linked List
    static Node removeDuplicateFromSorted(Node head) {
        Node curr = head;

        while (curr.next != null) {
            if (curr.data != curr.next.data) {
                curr = curr.next;
            } else {
                curr.next = curr.next.next;
            }
        }

        return head;
    }

    // is Sorted Linked List
    static boolean isSortedLinkedList(Node head) {
        Node curr = head;

        while (curr.next != null) {
            if (curr.data > curr.next.data) {
                return false;
            }
            curr = curr.next;
        }
        return true;
    }

    // Multiply Lists
    static long multiplyLists(Node head1, Node head2) {
        Long num1 = LinkedlistToLong(head1);
        Long num2 = LinkedlistToLong(head2);
        Long ans = num1 * num2;
        return ans;
    }

    // LinkedList to long Converter
    static Long LinkedlistToLong(Node head) {
        Node curr = head;
        long num = 0;
        while (curr != null) {
            num = num * 10 + curr.data;
            curr = curr.next;
        }

        return num;
    }

    // Rearrange list
    static Node rearrangeList(Node head) {
        ArrayList<Integer> list = new ArrayList<>();
        Node curr = head;
        while (curr != null) {
            list.add(curr.data);
            curr = curr.next;
        }

        LL newL = new LL();
        Node root = null;
        int start = 0;
        int end = list.size() - 1;

        while (start <= end) {
            root = newL.buildLinkedList(root, list.get(start));
            if (start != end) {
                root = newL.buildLinkedList(root, list.get(end));
            }
            start++;
            end--;
        }

        return root;
    }

    // Subtract Linked Lists

    // main function
    public static void main(String[] args) {
        Node root1 = null;
        int[] nodes1 = { 1, 2, 3, 4, 5, 6, 7 };
        LL ll = new LL();
        for (int i = 0; i < nodes1.length; i++) {
            root1 = ll.buildLinkedList(root1, nodes1[i]);
        }

        Node root2 = null;
        int[] nodes2 = { 2, 5 };
        LL ll2 = new LL();
        for (int i = 0; i < nodes2.length; i++) {
            root2 = ll2.buildLinkedList(root2, nodes2[i]);
        }

        // ---------->>
        Node ans = rearrangeList(root1);
        print_info(ans);

    }
}
