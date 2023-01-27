package Binary_Tree;

public class PreOrder_Traversal {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Binarytree {
        static int index = -1;

        Node buildTree(int[] nodes) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        void preOrder_Traversal(Node root) {
            if (root == null) {
                return;
            }

            System.out.print(root.data + " ");
            preOrder_Traversal(root.left);
            preOrder_Traversal(root.right);
        }
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Binarytree tree = new Binarytree();
        Node root = tree.buildTree(nodes);

        tree.preOrder_Traversal(root);
    }
}
