package Binary_Search_Tree;

public class Binary_Search_Tree_Traversal_Practice {

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

    // build Tree function
    public static Node buildBST(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (root.data > value) {
            root.left = buildBST(root.left, value);
        }

        if (root.data < value) {
            root.right = buildBST(root.right, value);
        }

        return root;
    }

    // InOrder travsersal
    public static void inOrderTraversalInBST(Node root) {
        if (root == null) {
            return;
        }

        inOrderTraversalInBST(root.left);
        System.out.print(root.data + " ");
        inOrderTraversalInBST(root.right);
    }

    // preOrder travsersal
    public static void preOderTraversalInBST(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOderTraversalInBST(root.left);
        preOderTraversalInBST(root.right);
    }

    // postOrder travsersal
    public static void postOderTraversalInBST(Node root) {
        if (root == null) {
            return;
        }

        postOderTraversalInBST(root.left);
        postOderTraversalInBST(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        int[] values = { 25, 15, 10, 4, 12, 22, 18, 24, 50, 35, 31, 44, 70, 66, 90 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = buildBST(root, values[i]);
        }

        preOderTraversalInBST(root);
        System.out.println();
        inOrderTraversalInBST(root);
        System.out.println();
        postOderTraversalInBST(root);
    }
}
