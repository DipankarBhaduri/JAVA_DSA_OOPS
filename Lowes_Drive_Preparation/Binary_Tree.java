package Lowes_Drive_Preparation;

public class Binary_Tree {

    // Node class
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    // Build Tree function
    static int index = -1;

    public static Node buildBinaryTree(int[] values) {
        index++;
        if (values[index] == -1) {
            return null;
        }

        Node newNode = new Node(values[index]);
        newNode.left = buildBinaryTree(values);
        newNode.right = buildBinaryTree(values);
        return newNode;
    }

    // Inoder traversal
    static void inOrder_of_binaryTree(Node root) {
        if (root == null) {
            return;
        }

        inOrder_of_binaryTree(root.left);
        System.out.print(root.data + " ");
        inOrder_of_binaryTree(root.right);
    }

    // preOrder traversal
    static void preOrder_of_binaryTree(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder_of_binaryTree(root.left);
        preOrder_of_binaryTree(root.right);
    }

    // postOrder traversal
    static void postOrder_of_binaryTree(Node root) {
        if (root == null) {
            return;
        }

        postOrder_of_binaryTree(root.left);
        postOrder_of_binaryTree(root.right);
        System.out.print(root.data + " ");
    }

    // main function
    public static void main(String[] args) {
        int[] values = { 25, 15, 10, 4, -1, -1, 12, -1, -1, 22, 18, -1, -1, 24, -1, -1, 50, 35, 31, -1, -1, 44, -1, -1,
                70, 66, -1, -1, 90, -1, -1, };

        Node root = buildBinaryTree(values);

        // Traversal of Tree
        preOrder_of_binaryTree(root);
        System.out.println();
        inOrder_of_binaryTree(root);
        System.out.println();
        postOrder_of_binaryTree(root);

    }
}
