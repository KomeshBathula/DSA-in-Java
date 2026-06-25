package Graphs.DisconnectedGraphs.DFS;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;

class GraphForList2 {
    List<List<Integer>> adjList;
    int n;
    GraphForList2(int _n) {
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
        Stack<Integer> st = new Stack<>();
        visited[node] = true;
        st.push(node);

        while (!st.isEmpty()) {
            int curr = st.pop();
            res.add(curr);
            for (int neighbor : adjList.get(curr)) {
                if (!visited[neighbor]) {
                    st.push(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
    }

}

public class DFSListWithoutRecursionWithoutStart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        GraphForList2 obj = new GraphForList2(n);
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
