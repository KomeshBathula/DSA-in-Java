import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

//technique 1
public class Stacks {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(1);
    st.push(2);
    st.push(3);
    Iterator<Integer> itr = st.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }
}


//technique 2
class Stacks1 {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(1);
    st.push(2);
    st.push(3);
    ListIterator<Integer> itr = st.listIterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }
}

//technique 3
class Stacks2 {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(1);
    st.push(2);
    st.push(3);
    
    for(Integer item: st) System.out.println(item);
  }
}

//technique 4
class Stacks3 {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(1);
    st.push(2);
    st.push(3);
    
    st.stream().forEach(s -> System.out.println(s));
  }
}

