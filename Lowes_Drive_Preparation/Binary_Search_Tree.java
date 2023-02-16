package Lowes_Drive_Preparation;

public class Binary_Search_Tree {

    // Node class
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.left = this.right = null;
            this.data = data;
        }
    }

    // Build Tree function
    public static Node buildBinarySearchTree(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (root.data > value) {
            root.left = buildBinarySearchTree(root.left, value);
        } else {
            root.right = buildBinarySearchTree(root.right, value);
        }

        return root;
    }

    // Inoder traversal
    static void inOrder_of_binarySearchTree(Node root) {
        if (root == null) {
            return;
        }

        inOrder_of_binarySearchTree(root.left);
        System.out.print(root.data + " ");
        inOrder_of_binarySearchTree(root.right);
    }

    // preOrder traversal
    static void preOrder_of_binarySearchTree(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder_of_binarySearchTree(root.left);
        preOrder_of_binarySearchTree(root.right);
    }

    // postOrder traversal
    static void postOrder_of_binarySearchTree(Node root) {
        if (root == null) {
            return;
        }

        postOrder_of_binarySearchTree(root.left);
        postOrder_of_binarySearchTree(root.right);
        System.out.print(root.data + " ");
    }

    // this is main function
    public static void main(String[] args) {
        int[] values = { 25, 15, 10, 4, 12, 22, 18, 24, 50, 35, 31, 44, 70, 66, 90 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = buildBinarySearchTree(root, values[i]);
        }

        preOrder_of_binarySearchTree(root);
        System.out.println();
        inOrder_of_binarySearchTree(root);
        System.out.println();
        postOrder_of_binarySearchTree(root);
    }
}
