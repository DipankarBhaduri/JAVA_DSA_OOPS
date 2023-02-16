package Binary_Tree;

public class Binary_Tree_Traversal_practice {

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

    static int idx = -1;

    public static Node buildBT(int[] values) {
        idx++;
        if (values[idx] == -1) {
            return null;
        }

        Node newNode = new Node(values[idx]);
        newNode.left = buildBT(values);
        newNode.right = buildBT(values);
        return newNode;
    }

    // build Tree function
    public static void main(String[] args) {
        int[] values = { 25, 15, 10, 4, 12, 22, 18, 24, 50, 35, 31, 44, 70, 66, 90 };
        Node root = buildBT(values);
        System.out.println(root);
    }
}