package SegmentTrees;

public class SegmentTreeNode {
    int start, end, sum;
    SegmentTreeNode left, right;

    SegmentTreeNode(int _start, int _end) {
        start = _start;
        end = _end;
        sum = 0;
        left = null;
        right = null;
    }
}
