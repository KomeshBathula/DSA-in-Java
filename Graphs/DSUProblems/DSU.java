package Graphs.DSUProblems;

public class DSU {
    int n;
    int[] parent;
    
    DSU(int _n) {
        n = _n;
        parent = new int[n];

        for (int i = 0; i < n; i++) 
            parent[i] = i;
    }

    int find(int i) {
        if (parent[i] == i) 
            return i;
        
        return parent[i] = find(parent[i]);
    }

    void union(int u, int v) {
        int uPar = find(u);
        int vPar = find(v);

        if (uPar != vPar) 
            parent[uPar] = vPar;
    }
}
