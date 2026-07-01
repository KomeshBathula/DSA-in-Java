package Graphs.DSUProblems;

import java.util.Arrays;
import java.util.Scanner;

class DSU2 {
    int n;
    int[] parent;
    int[] size;
    int time = 0;

    DSU2(int _n) {
        n = _n;
        parent = new int[n];
        size = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    int findParent(int i) {
        if (i == parent[i]) return i;

        return parent[i] = findParent(parent[i]);
    }

    void unionBySize(int u, int v) {
        int ulp_u = findParent(u);
        int ulp_v = findParent(v);

        if (ulp_u == ulp_v) return;

        if (size[ulp_u] < size[ulp_v]) {
            parent[ulp_u] = ulp_v;
            size[ulp_v] += size[ulp_u];
        }

        else {
            parent[ulp_v] = ulp_u;
            size[ulp_u] += size[ulp_v];
        }
    }
}

public class EveryoneBecomeFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) 
                arr[i][j] = sc.nextInt();
        }

        Arrays.sort(arr, (a, b) -> a[2] - b[2]);
        DSU2 dsu = new DSU2(n);

        for (int i = 0; i < n; i++) {
            int u = arr[i][0];
            int v = arr[i][1];

            if (dsu.findParent(u) == dsu.findParent(v)) 
                continue;

            dsu.unionBySize(u, v);
            dsu.time = arr[i][2];
        }

        System.out.println(dsu.time);
        sc.close();
    }
}
