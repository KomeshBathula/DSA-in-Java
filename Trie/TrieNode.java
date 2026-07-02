package Trie;

public class TrieNode {
    TrieNode[] child;
    int count;
    boolean isLeaf;

    TrieNode() {
        child = new TrieNode[26];
        count = 0;
        isLeaf = false;
    }
}