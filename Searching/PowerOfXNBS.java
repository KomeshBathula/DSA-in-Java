package Searching;

public class PowerOfXNBS {
  public static void main(String[] args) {
    int x = 2;
    int n = 5;
    System.out.println(getResult(x,n));
  }
  static int getResult(int x, int n){
    int result = 1;
    while(n!=0){
      if(n%2 != 0){ 
        n--;
        result *= x;
      }
      else {
        n/=2;
        x = x*x;
      }

    }
    return result;
  }
}
