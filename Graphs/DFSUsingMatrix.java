package Graphs;

import java.util.Arrays;

class Graph {
    int n;
    int M[][];
    Graph(int n) {
        this.n = n;
        M = new int[n][n];
    }
    void addEdge(int u, int v) {
        M[u][v] = 1;
        M[v][u] = 1;
    }
    void DFSTraversal(int n, int start, int[] visited) {
        System.out.print(start + " ");
        visited[start] = 1;
        for (int i = 0; i < n; i++) {
            if (M[start][i] == 1 && visited[i] == -1) {
                DFSTraversal(n, i, visited);
            }
        }
    }
}
public class DFSUsingMatrix {
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(0, 4);
        g.addEdge(1, 3);
        int[] visited = new int[5];
        Arrays.fill(visited, -1);
        g.DFSTraversal(5, 0, visited);
    }
}
