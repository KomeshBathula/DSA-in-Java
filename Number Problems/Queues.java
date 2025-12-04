import java.util.Queue;
import java.util.Iterator;
import java.util.LinkedList;

//technique 1
class Queues {
  public static void main(String[] args) {
    Queue<String> q = new LinkedList<>();
    q.offer("abc");
    q.offer("def");
    q.offer("ghi");
    for(String x:q) System.out.println(x);
  }
}


//technique 2
class Queues1 {
  public static void main(String[] args) {
    Queue<String> q = new LinkedList<>();
    q.offer("abc");
    q.offer("def");
    q.offer("ghi");
    Iterator<String> it = q.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}


//technique 

//technique 3
class Queues3 {
  public static void main(String[] args) {
    Queue<String> q = new LinkedList<>();
    q.offer("abc");
    q.offer("def");
    q.offer("ghi");
    q.stream().forEach(s -> System.out.println(s));
  }
}