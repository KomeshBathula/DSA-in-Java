package Graphs.DisconnectedGraphs.DFS;

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

    List<Integer> getDFS() {
        List<Integer> res = new ArrayList<>();
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) 
                DFS(visited, i, res);
        }
        return res;
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

public class DFSListRecursionWithoutStart {
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
        List<Integer> res = obj.getDFS();
        for (int i : res) 
            System.out.print(i+" ");
        sc.close();
    }
}
