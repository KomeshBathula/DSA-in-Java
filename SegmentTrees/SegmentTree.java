package SegmentTrees;

public class SegmentTree {
    SegmentTreeNode root;
    SegmentTree(int[] arr) {
        root = buildTree(arr, 0, arr.length - 1);
    }

    SegmentTreeNode buildTree(int[] a, int start, int end) {
        if (start > end) return null;
        SegmentTreeNode t = new SegmentTreeNode(start, end);
        if (start == end) 
            t.sum = a[start];
        else {
            int m = start + (end - start) / 2;
            root.left = buildTree(a, start, m);
            root.right = buildTree(a, m + 1, end);
            t.sum = t.left.sum + t.right.sum;
        }
        return t;
    
    }

    int rangeSum(int i, int j) {
        return rangeSum1(root,i, j);
    }

    int rangeSum1(SegmentTreeNode t, int s, int e) {
        if (t == null || s > t.end || e < t.start) 
            return 0;

        if (s >= t.start && e < t.end)
            return t.sum;

        return rangeSum1(t.left, s, e) + rangeSum1(t.right, s, e);
    }
}
