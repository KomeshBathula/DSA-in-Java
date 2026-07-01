package Graphs.MST;

import java.util.Arrays;
import java.util.Scanner;

public class KruskalAlgorithm {
    static int[] parent;

    private static int findPar(int i) {
        if (i == parent[i]) return i;

        return parent[i] = findPar(parent[i]);
    }

    private static void union(int u, int v) {
        int uPar = findPar(u);
        int vPar = findPar(v);

        if (uPar == vPar) return;

        parent[u] = v;
    }
    private static int kruskalMST(int V, int[][] edges) {
        parent = new int[V];
        for (int i = 0; i < V; i++) parent[i] = i;

        Arrays.sort(edges, (x, y) -> x[2] - y[2]);
        int count = 0, cost = 0;
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int w = edges[i][2];

            int uPar = findPar(u);
            int vPar = findPar(v);

            if (uPar != vPar) {
                union(u, v);
                cost += w;

                count++;
                if (count == V - 1) 
                    break;
            }
        }
        return cost;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int M = sc.nextInt();
        int[][] edges = new int[M][3];
        for (int i = 0; i < M; i++) {
            edges[i][0] = sc.nextInt();
            edges[i][1] = sc.nextInt();
            edges[i][2] = sc.nextInt();
        }
        int ans = kruskalMST(V, edges);
        System.out.println(ans);
        sc.close();
    }
}
