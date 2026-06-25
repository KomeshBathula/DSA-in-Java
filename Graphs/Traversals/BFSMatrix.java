package Graphs.Traversals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class Graph4 {
    int n;
    int[][] M;

    Graph4(int _n) {
        n = _n;
        M = new int[n][n];
    }

    void addEdge(int u, int v) {
        M[u][v] = 1;
        M[v][u] = 1;
    }

    List<Integer> bfsTraversal(int start) {
        List<Integer> res = new ArrayList<>();
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;
        while (!q.isEmpty()) {
            int curr = q.poll();
            res.add(curr);

            for (int i = 0; i < n; i++) {
                if (M[curr][i] == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
        return res;
    }
}
public class BFSMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        Graph4 obj = new Graph4(n);
        int e = sc.nextInt();
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            obj.addEdge(u, v);
        }

        List<Integer> bfs = obj.bfsTraversal(0);
        for (int i : bfs) {
            System.out.print(i+" ");
        }
        sc.close();
    }
}
