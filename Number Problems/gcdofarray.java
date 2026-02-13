class Gcd{
  public static void main(String[] args) {
  int arr[] = {12,48,54,72};
  int n = arr.length;
  System.out.println(gcd1(arr,n));
  }
  static int gcd1(int a[],int n){
    int ans = gcd(a[0],a[1]);
    for(int i=2;i<n;i++)
      ans = gcd(ans,a[i]);
    return ans;
  }

  static int gcd(int a,int b){
    while(b%a!=0){
      int r = b%a;
      b = a;
      a = r;
    }
    return a;
  }
}