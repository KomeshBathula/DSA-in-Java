
import java.util.ArrayList;

public class AllFibonacciProbs{
  public static void main(String[] args) {
    //System.out.println(nthFibonacci(2));
    //FibNumbers(15);
    /*ArrayList<Integer> al = new ArrayList<>();
    al.addAll(allFibonacci(9));
    for(int x:al) System.out.print(x+" ");*/
    //fibUptoN(21);
    //System.out.println(fibOrNot(21));
    //System.out.print(sumOfFibo(5));

    System.out.println(prevFibo(8));
  }
  static int nthFibonacci(int n){
    if(n==0) return 0;
    else if(n==1) return 1;
    else {
      int a = 0, b = 1, c = 0;
      for(int i=2;i<=n;i++){
        c = a + b;
        a = b;
        b = c;
      }
      return c;
    }
  }

  static void fibNumbers(int n){
    if(n==1) System.out.println(0);
    else if(n==2) System.out.print(0+" "+1+" ");
    else {
      int a = 0, b = 1, c = 0;
      System.out.print(a+" "+b);
      for(int i=3;i<=n;i++){
        c = a + b;
        System.out.print(c+" ");
        a = b;
        b = c;
      }
    }
  }

  static ArrayList<Integer> allFibonacci(int n){
    ArrayList<Integer> al = new ArrayList<>();
    if(n==0) al.add(0);
    else if(n==1){
      al.add(0);
      al.add(1);
    }
    else{
      int a = 0, b = 1, c = 0;
      al.add(a);
      al.add(b);
      for(int i=3;i<=n;i++){
        c = a + b;
        al.add(c);
        a = b;
        b = c;
      }
    }
    return al;
  }

  static void fibUptoN(int n){
    if(n==0) System.out.print(0);
    else{
      int a = 0, b = 1, c = 0;
      System.out.print(a+" "+b);
      while(c<n){
        c = a + b;
        System.out.print(c+" ");
        a = b;
        b = c;
      }
    }
  }

  static boolean fibOrNot(int n){
    /*if(n==0) return true;
    else if(n==1) return true;
    else{
      int a = 0, b = 1, c = 0;
      while(c<n){
        c = a + b;                    O(n)
        if(c==n) return true;
        a = b;
        b = c;
      }
      return false;
    }
  */

  return (Math.ceil(5*(n*n)-4) == Math.floor(5*(n*n)-4) || (Math.ceil(5*(n*n)+4) == Math.floor(5*(n*n)+4)));

  }

  static int sumOfFibo(int n){
    int sum = 0;
    if(n==0) sum = 0;
    else {
      int a = 0, b = 1, c = 0;
      sum = a + b;
      for(int i=3;i<=n;i++){
        c = a + b;
        sum += c;
        a = b;
        b = c;
      }
      return sum;
    }
    return 0;
  }

  static int prevFibo(int n){
    return (2*n/(1+(int)Math.sqrt(5)));
  }
}