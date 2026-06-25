package Graphs.DisconnectedGraphs.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class GraphMatrix {
    int Matrix[][];
    int n;

    GraphMatrix(int n) {
        this.n = n;
        Matrix = new int[n][n];
    }

    void addEdge(int u, int v) {
        Matrix[u][v] = 1;
        Matrix[v][u] = 1;
    }

    void bfs(int start, boolean[] visited, List<Integer> bfsOrder) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            bfsOrder.add(vertex);
            for (int i = 0; i < n; i++) {
                if (Matrix[vertex][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }

}
public class BFSMatrixWithoutStart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        GraphMatrix g = new GraphMatrix(n);
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            g.addEdge(u, v);
        }
        List<Integer> bfsOrder = new ArrayList<>();
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                g.bfs(i, visited, bfsOrder);
            }
        }
        for (int vertex : bfsOrder) {
            System.out.print(vertex + " ");
        }
        sc.close();
    }   
}
