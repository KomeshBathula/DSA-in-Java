package Graphs.Traversals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class Graph5 {
    int n;
    List<List<Integer>> adj;

    Graph5(int _n) {
        n = _n;
        
        adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
    }

    void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
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

            for (int i : adj.get(curr)) {
                if (!visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
        return res;
    }
}

public class BFSList {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        Graph5 obj = new Graph5(n);
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
