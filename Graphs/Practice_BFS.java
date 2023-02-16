package Graphs;

import java.util.*;

public class Practice_BFS {

    // Object class , its Store Source , Destination , Weight :)
    static class Edge {
        int src;
        int dest;
        int wt;

        Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void createAdjacencyList(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        /*
         * ___(1)____________(3)___
         * / | \
         * / | \
         * / | \
         * (0) | (5)-------(6)
         * \ | /
         * \ | /
         * \___(2)____________(4)___/
         * 
         */

        // adding all vertex into my list :)
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));
    }

    static void breadth_First_Search(ArrayList<Edge>[] graph) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[graph.length];
        q.add(0);

        while (!q.isEmpty()) {
            int cur = q.remove();

            if (!vis[cur]) {
                System.out.print(cur + " ");
                vis[cur] = true;

                for (int i = 0; i < graph[cur].size(); i++) {
                    Edge e = graph[cur].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge>[] graph = new ArrayList[v];

        // Creating Adjacency List :)
        createAdjacencyList(graph);

        // Breadth First Search :)
        breadth_First_Search(graph);
    }
}
