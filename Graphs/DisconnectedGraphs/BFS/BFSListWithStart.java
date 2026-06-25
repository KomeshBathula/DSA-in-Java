package Graphs.DisconnectedGraphs.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class GraphForList1 {
    ArrayList<ArrayList<Integer>> adjList;
    int n;

    GraphForList1(int n) {
        this.n = n;
        adjList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
    }
    
    void addEdge(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    void bfs(int start, boolean[] visited, List<Integer> bfsOrder) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            bfsOrder.add(vertex);
            for (int neighbor : adjList.get(vertex)) {
                if (!visited[neighbor]) {
                    queue.add(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
    }
}

public class BFSListWithStart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        GraphForList1 g = new GraphForList1(n);
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            g.addEdge(u, v);
        }
        List<Integer> bfsOrder = new ArrayList<>();
        boolean[] visited = new boolean[n];
        int start = sc.nextInt();
        g.bfs(start, visited, bfsOrder);
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
