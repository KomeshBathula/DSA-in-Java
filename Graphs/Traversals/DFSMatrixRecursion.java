package Graphs.Traversals;

import java.util.Arrays;
import java.util.Scanner;

class Graph1 {
    Scanner sc = new Scanner(System.in);
    int n;
    int M[][];
    Graph1(int n) {
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
    void traversal(int[] visited) {
        while (true) {
            System.out.println("Enter start of Node");
            int start = sc.nextInt();
            if (start == -1) 
                return;
            DFSTraversal(n, start, visited);
            Arrays.fill(visited, -1);
        }
    }
}
public class DFSMatrixRecursion {

    public static void main(String[] args) {
        Graph1 g = new Graph1(5);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(0, 4);
        g.addEdge(1, 3);
        int[] visited = new int[5];
        Arrays.fill(visited, -1);
        g.traversal(visited);
    }
}
