package Graphs.ConnectedComponents;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class GraphForList {
    List<List<Integer>> adjList;
    int n;
    GraphForList(int _n) {
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


    void DFS(boolean[] visited, int node, List<Integer> res) {
        visited[node] = true;
        res.add(node);
        for (int neighbor : adjList.get(node)) {
            if (!visited[neighbor]) {
                DFS(visited, neighbor, res);
            }
        }
    }

}


public class PrintAllComponentsList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        GraphForList obj = new GraphForList(n);
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            obj.addEdge(u, v);
        }
        List<List<Integer>> components = new ArrayList<>();
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                List<Integer> component = new ArrayList<>();
                obj.DFS(visited, i, component);
                components.add(component);
            }
        }
        for (List<Integer> component : components) {
            for (int node : component) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
