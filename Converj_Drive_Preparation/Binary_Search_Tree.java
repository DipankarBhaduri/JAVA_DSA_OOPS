package Converj_Drive_Preparation;

public class Binary_Search_Tree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    // <------------------------------BUILD_A_BINARY_SEARCH_TREE---------------------------------->
    public static Node buildBinarySearchTree(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (root.data > data) {
            root.left = buildBinarySearchTree(root.left, data);
        }

        if (root.data < data) {
            root.right = buildBinarySearchTree(root.right, data);
        }

        return root;
    }

    // <------------------------------MAIN_METHOD_OR_FUNCTION------------------------------------->
    public static void main(String[] args) {

        int[] nodes = { 10, 5, 2, 6, 15 };
        Node root = null;

        for (int i = 0; i < nodes.length; i++) {
            root = buildBinarySearchTree(root, nodes[i]);
        }

        System.out.println(root.data + " ");
    }
}
