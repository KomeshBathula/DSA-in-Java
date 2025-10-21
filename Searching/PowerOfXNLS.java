package Searching;

public class PowerOfXNLS {
  public static void main(String[] args) {
    int x = 2;
    int n = 5;
    System.out.println(getResult(x, n));
  }
  static int getResult(int x, int n) {
    int result = 1;
    for (int i = 0; i < n; i++) {
      result *= x;
    }
    return result;
  }
}
