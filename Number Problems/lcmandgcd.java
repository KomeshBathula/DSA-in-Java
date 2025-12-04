class Solution{
  public static void main(String[] args) {
    System.out.println(gcd2(12,18));
    System.out.println(lcm1(12, 18));
  }
  static int gcd(int m,int n){
    int r = Math.min(m,n);
    while (r>1) {
      if(m%r==0 && n%r==0){
        return r;
      }
      r--;
    }
    return 1;
  }
  static int gcd1(int a,int b){
    while(b%a!=0){
      int r = b%a;
      b = a;
      a = r;
    }
    return a;
  }
  static int gcd2(int a,int b){
    while(a!=b){
      if(a>b) a = a-b;
      else b = b-a;
    }
    return a;
  }
  static int lcm(int a,int b){
    int ans = gcd(a, b);
    return (a*b)/ans;
  }
  static int lcm1(int a,int b){
    int x = Math.max(a,b);
    int y = Math.min(a,b);
    for(int i=x;i<=a*b;i+=x){
      if(i%y==0) return i;
    }
    return a*b;
  }
}