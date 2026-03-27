package StackQuestions;

import java.util.Stack;

public class QueueUsingStack2 {
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
        
    }
    private static void deque() {
        
    }
    private static void peek() {
        System.out.println(st2.peek());
    }
}
