package StackQuestions;

import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(82);
        st.push(4);
        st.push(30);
        st.push(12);
        st.push(21);
        sortStack(st);
        //for (Integer val : st) System.out.println(val +" ");
    }
    private static void sortStack(Stack<Integer> st) {
        Stack<Integer> tempStack = new Stack<>();
        while (!st.isEmpty()) {
            int el = st.pop();
            if (tempStack.isEmpty()) tempStack.push(el);
            else {
                while (!tempStack.isEmpty() && el < tempStack.peek() ) {
                    st.push(tempStack.pop());
                }
                tempStack.push(el);
            }
        }
        for (Integer val : tempStack) System.out.println(val + " ");
    }
}
