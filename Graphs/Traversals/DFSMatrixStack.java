package Graphs.Traversals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

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
    List<Integer> DFSTraversalUsingStack(int start, int[] visited) {
        Stack<Integer> st = new Stack<>();
        st.push(start);
        visited[start] = 1;
        List<Integer> res = new ArrayList<>();
        while (!st.isEmpty()) {
            int curr = st.pop();
            res.add(curr);
            for (int i = 0; i < n; i++) {
                if (M[curr][i] == 1 && visited[i] == -1) {
                    st.push(i);
                    visited[i] = 1;
                }
            }
        }
        return res;

    }
    void traversal(int[] visited) {
        while (true) {
            System.out.println("Enter start of Node");
            int start = sc.nextInt();
            if (start == -1) 
                return;
            List<Integer> ans = DFSTraversalUsingStack(start, visited);
            for (int i : ans) {
                System.out.print(i+" ");
            }
            Arrays.fill(visited, -1);
        }
    }
}

public class DFSMatrixStack {
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
