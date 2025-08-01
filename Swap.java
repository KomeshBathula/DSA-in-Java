public class Swap {
  public static void main(String[] args) {
    swap1(7,9);
    swap2(7,9);
    swap3(7,9);
    swap4(7,9);
    swap5(7,9);
    swap6(7,9);
  }
  static void swap1(int a,int b){
    System.out.println(a+" "+b);
    int temp = a;
    a = b;
    b = temp;
    System.out.println(a+" "+b);
  }
  static void swap2(int a,int b){
    System.out.println(a+" "+b);
    a = a+b;
    b = a-b;
    a = a-b;
    System.out.println(a+" "+b);
  }
  static void swap3(int a,int b){
    System.out.println(a+" "+b);
    a = a * b;
    b = a / b;
    a = a / b;
    System.out.println(a+" "+b);
  }
  static void swap4(int a,int b){
    System.out.println(a+" "+b);
    a = a ^ b;
    b = a ^ b;
    a = a ^ b;
    System.out.println(a+" "+b);
  }
  static void swap5(int a,int b){
    System.out.println(a+" "+b);
    b = (a+b)-(a=b);
    System.out.println(a+" "+b);
  }
  static void swap6(int a,int b){
    System.out.println(a+" "+b);
    
    System.out.println(a+" "+b);
  }
}
