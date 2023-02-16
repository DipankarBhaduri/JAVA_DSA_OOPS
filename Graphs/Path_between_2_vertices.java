package Graphs;

import java.io.*;
import java.util.*;

public class Path_between_2_vertices {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<ArrayList<Integer>> Edges = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < M; i++) {
            ArrayList<Integer> e = new ArrayList<Integer>();
            e.add(sc.nextInt());
            e.add(sc.nextInt());
            Edges.add(e);
        }
        int U = sc.nextInt();
        int V = sc.nextInt();
        Solution ob = new Solution();
        if (ob.check(N, M, Edges, U, V)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        sc.close();
    }
}

class Solution {
    boolean check(int N, int M, ArrayList<ArrayList<Integer>> Edges, int U, int V) {
        boolean b = helper(Edges, U, V, new boolean[N]);
        return b;
    }

    static boolean helper(ArrayList<ArrayList<Integer>> Edges, int U, int V, boolean vis[]) {
        if (U == V) {
            return true;
        }

        vis[U] = true;
        for (int i = 0; i < Edges.get(U).size(); i++) {
            int e = Edges.get(U).get(i);
            if (!vis[e] && helper(Edges, e, V, vis)) {
                return true;
            }
        }
        return false;
    }
}