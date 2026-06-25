package Graphs.ConnectedComponents;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Graph {
    List<List<Integer>> adjList;
    int n;

    Graph(int _n) {
        n = _n;
        adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    void addEdge(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    void dfs(boolean[] visited, int start) {
        visited[start] = true;

        for (int i : adjList.get(start)) {
            if (!visited[i]) 
                dfs(visited, i);
        }
    }
}
public class GraphIsConnectedOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();

        Graph g = new Graph(n);
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            g.addEdge(u, v);
        }

        boolean[] visited = new boolean[n];
        g.dfs(visited, 0);
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                System.out.println("Not Connected");
                return;
            }
        }
        System.out.println("YES, Connected");
        sc.close();
    }
}
