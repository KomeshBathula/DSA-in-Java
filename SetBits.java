import java.util.Scanner;
public class SetBits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(setBits1(n));
    System.out.println(setBits2(n));
    System.out.println(setBits3(n));
    sc.close();
  }
  static int setBits1(int n){
    int c = 0;
    while(n>0){
      if(n%2==1) c++;
      n=n/2;
    }
    return c;
  }
  static int setBits2(int n){
    int c = 0;
    while(n>0){
      c=c+(n&1);
      n=n>>1;
    }
    return c;
  }
  static int setBits3(int n){
    int c = 0;
    while(n>0){
      n=n&(n-1);
      c++;
    }
    return c;
  }
}
