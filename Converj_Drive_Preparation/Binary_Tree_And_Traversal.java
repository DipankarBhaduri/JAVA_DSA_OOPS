package Converj_Drive_Preparation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;

public class Binary_Tree_And_Traversal {
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

    // <------------------------------------------BUILD_A_TREE------------------------------------>

    static class BinaryTree {
        static int index = -1;

        public Node buildTree(int[] nodes) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    // <-------------------------------------PREORDER_TRAVERSAL----------------------------------->

    public static void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    // <------------------------------------------LEFT_VIEW--------------------------------------->

    public static ArrayList<Integer> leftView(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        ArrayList<Integer> list = new ArrayList<>();
        boolean flag = true;

        while (!q.isEmpty()) {
            Node curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                    flag = true;
                }

            } else {
                if (flag == true) {
                    list.add(curr.data);
                    flag = false;
                }

                if (curr.left != null) {
                    q.add(curr.left);
                }

                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
        return list;
    }

    // <------------------------------------------RIGHT_VIEW-------------------------------------->

    public static ArrayList<Integer> rightView(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        ArrayList<Integer> list = new ArrayList<>();
        int lastVal = 0;

        while (!q.isEmpty()) {
            Node curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    list.add(lastVal);
                    break;
                } else {
                    q.add(null);
                    list.add(lastVal);
                }

            } else {
                lastVal = curr.data;
                if (curr.left != null) {
                    q.add(curr.left);
                }

                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
        return list;
    }

    static class info {
        int hd;
        Node node;

        info(int hd, Node root) {
            this.hd = hd;
            this.node = root;
        }
    }

    // <--------------------------------------------TOP_VIEW-------------------------------------->

    public static ArrayList<Integer> topView(Node root) {
        Queue<info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        q.add(new info(0, root));
        q.add(null);
        int min = 0;
        int max = 0;

        while (!q.isEmpty()) {
            info curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }

                if (curr.node.left != null) {
                    q.add(new info(curr.hd - 1, curr.node.left));
                    min = Math.min(min, curr.hd - 1);
                }

                if (curr.node.right != null) {
                    q.add(new info(curr.hd + 1, curr.node.right));
                    max = Math.max(max, curr.hd + 1);
                }
            }
        }

        for (int i = min; i <= max; i++) {
            list.add(map.get(i).data);
        }

        return list;
    }

    // <-----------------------------------------BOTTOM_VIEW-------------------------------------->
    public static ArrayList<Integer> bottomView(Node root) {
        Queue<info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        q.add(new info(0, root));
        q.add(null);
        int min = 0;
        int max = 0;

        while (!q.isEmpty()) {
            info curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {

                map.put(curr.hd, curr.node);

                if (curr.node.left != null) {
                    q.add(new info(curr.hd - 1, curr.node.left));
                    min = Math.min(min, curr.hd - 1);
                }

                if (curr.node.right != null) {
                    q.add(new info(curr.hd + 1, curr.node.right));
                    max = Math.max(max, curr.hd + 1);
                }
            }
        }

        for (int i = min; i <= max; i++) {
            list.add(map.get(i).data);
        }

        return list;
    }

    // <---------------------------------INORDER_TRAVERSAL---------------------------------------->

    public static void inOder_Traversal(Node root) {
        if (root == null) {
            return;
        }

        inOder_Traversal(root.left);
        System.out.print(root.data + " ");
        inOder_Traversal(root.right);
    }

    // <----------------------------------BOUNDARY_TRAVERSAL-------------------------------------->

    public static boolean isLeaf(Node root) {
        if (root.left == null & root.right == null) {
            return true;
        }
        return false;
    }

    public static void addLeftBoundary(Node root, ArrayList<Integer> list) {
        Node curr = root.left;
        while (curr != null) {
            if (!isLeaf(curr)) {
                list.add(curr.data);
            }

            if (curr.left != null) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
    }

    public static void addRightBoundary(Node root, ArrayList<Integer> list) {
        Node curr = root.right;

        ArrayList<Integer> arr = new ArrayList<>();

        while (curr != null) {
            if (!isLeaf(curr)) {
                arr.add(curr.data);
            }

            if (curr.right != null) {
                curr = curr.right;
            } else {
                curr = curr.left;
            }
        }

        for (int i = arr.size() - 1; i >= 0; i--) {
            list.add(arr.get(i));
        }
    }

    public static void AddLeafNodes(Node root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }

        AddLeafNodes(root.left, list);
        if (root.left == null && root.right == null) {
            list.add(root.data);
        }
        AddLeafNodes(root.right, list);
    }

    public static ArrayList<Integer> boundaryOrderTraversal(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (!isLeaf(root)) {
            list.add(root.data);
        }

        addLeftBoundary(root, list);
        AddLeafNodes(root, list);
        addRightBoundary(root, list);
        return list;
    }

    // <----------------------------------ZIG_ZAG_TRAVERSAL--------------------------------------->

    public static ArrayList<ArrayList<Integer>> zigZagTraversal(Node root) {
        Queue<Node> q = new LinkedList<>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        q.add(root);
        q.add(null);

        boolean flag = true;
        Stack<Integer> stk = new Stack<>();

        ArrayList<Integer> arr = new ArrayList<>();

        while (!q.isEmpty()) {
            Node curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    if (flag) {
                        list.add(arr);
                    } else {
                        while (!stk.isEmpty()) {
                            arr.add(stk.pop());
                        }

                        list.add(arr);
                    }

                    break;

                } else {
                    q.add(null);

                    if (flag) {
                        list.add(arr);
                        arr = new ArrayList<>();
                        flag = false;

                    } else {

                        while (!stk.isEmpty()) {
                            arr.add(stk.pop());
                        }

                        list.add(arr);
                        arr = new ArrayList<>();
                        flag = true;

                    }
                }
            } else {

                if (flag) {
                    arr.add(curr.data);
                } else {
                    stk.push(curr.data);
                }

                if (curr.left != null) {
                    q.add(curr.left);
                }

                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }

        return list;
    }

    // <---------------------------------LEVEL_ORDER_TRAVERSAL------------------------------------>

    public static ArrayList<ArrayList<Integer>> levelOrderTraversal(Node root) {
        Queue<Node> q = new LinkedList<>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        q.add(root);
        q.add(null);

        ArrayList<Integer> arr = new ArrayList<>();

        while (!q.isEmpty()) {
            Node curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    list.add(arr);
                    break;
                } else {
                    q.add(null);
                    list.add(arr);
                    arr = new ArrayList<>();
                }
            } else {
                arr.add(curr.data);

                if (curr.left != null) {
                    q.add(curr.left);
                }

                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }

        return list;
    }

    // <------------------------------VERTICAL_ORDER_TRAVERSAL------------------------------------>

    static class Vartical {
        int Hd;
        int Level; // Hd --> Horizontal distance
        Node node;

        Vartical(Node node, int Hd, int Level) {
            this.Hd = Hd;
            this.Level = Level;
            this.node = node;
        }
    }

    public static ArrayList<ArrayList<Integer>> verticalOrderOfAList(Node root) {
        Queue<Vartical> q = new LinkedList<>();
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();

        q.add(new Vartical(root, 0, 0));

    }

    // <--------------------------------MAIN_METHOD_OR_FUNCTION----------------------------------->
    public static void main(String[] args) {
        // int[] nodes = { 1, 2, 4, -1, -1, 5, 8, -1, -1, 9, -1, -1, 3, 6, -1, -1, 7,
        // -1, -1 };
        int[] nodes = { 1, 2, 3, -1, 4, 5, -1, -1, 6, -1, -1, -1, 7, -1, 8, 9, 10, -1, -1, 11, -1, -1, -1 };
        BinaryTree BT = new BinaryTree();
        Node root = BT.buildTree(nodes);

        ArrayList<ArrayList<Integer>> list = verticalOrderOfAList(root);
        for (ArrayList<Integer> arr : list) {
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}

// <-------VERTICAL_ORDER_TRAVERSAL , -------------->