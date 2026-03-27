package StackQuestions;

import java.util.Stack;

public class QueueUsingStack {
    static Stack<Integer> st1 = new Stack<>();
    static Stack<Integer> st2 = new Stack<>();
    public static void main(String[] args) {
        enque(42);
        enque(8);
        enque(9);
        enque(12);
        enque(45);
        deque();
        peek();
        deque();
    }
    private static void enque(int el) {
        st1.push(el);
        for (Integer val : st1) System.out.print(val+" ");
        System.out.println();
    }
    private static void deque() {
        while (!st1.isEmpty()) st2.push(st1.pop());
        System.out.println(st2.pop());
    }
    private static void peek() {
        System.out.println(st2.peek());
    }
}
