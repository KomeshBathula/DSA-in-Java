package Graphs.ConnectedComponents;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class GraphForList1 {
    List<List<Integer>> adjList;
    int n;
    GraphForList1(int _n) {
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


    void DFS(boolean[] visited, int node) {
        visited[node] = true;
        // res.add(node);
        for (int neighbor : adjList.get(node)) {
            if (!visited[neighbor]) {
                DFS(visited, neighbor);
            }
        }
    }

}


public class CountNumberOfComponents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        GraphForList1 obj = new GraphForList1(n);
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            obj.addEdge(u, v);
        }
        boolean[] visited = new boolean[n];

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                obj.DFS(visited, i);
                count++;
            }
        }
        System.out.println(count);
        
        sc.close();
    }
}
