public class PrimeOrNot {
  public static void main(String[] args) {
    System.out.println(isPrime(7));
    System.out.println(isPrime1(13));
    System.out.println(isPrime2(29));
    System.out.println(isPrime3(9));
    System.out.println(isPrime4(143));
  }
  static boolean isPrime(int n){
    int c = 0;
    for(int i=1;i<=n;i++){
      if(n%i==0) c++;
    }
    if(c==2) return true;
    return false;
  }

  static boolean isPrime1(int n){
    int c = 1;
    for(int i=1;i<=n/2;i++){
      if(n%i==0) c++;
    }
    if(c==2) return true;
    return false;
  }

  static boolean isPrime2(int n){
    int c = 0;
    for(int i=1;i*i<=n;i++){
      if(n%i==0){
        c++;
        if(n/i!=i) c++;
      }
    }
    if(c==2) return true;
    return false;
  }

  static boolean isPrime3(int n){
    if(n<=1) return false;
    for(int i=2;i*i<=n;i++){
      if(n%i==0) return false;
    }
    return true;
  }

  static boolean isPrime4(int n){
    if(n<=1) return false;
    if(n==2||n==3) return true;
    if(n%2==0||n%3==0) return false;
    for(int i=5;i*i<=Math.sqrt(n);i++){
      if(n%i==0||n%(i+2)==0) return false;
    }
    return true;
  }
}
