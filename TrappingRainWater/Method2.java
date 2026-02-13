package TrappingRainWater;

public class Method2 {
  public static void main(String[] args) {
    int arr[] = {3,0,2,0,4};
    System.out.println(trapRain(arr));
  }
  static int trapRain(int arr[]){
    int lmax[] = new int[arr.length];
    int rmax[] = new int[arr.length];
    lmax[0] = arr[0];
    rmax[arr.length - 1] = arr[arr.length - 1];
    for(int i = 1;i<arr.length;i++){
      lmax[i] = Math.max(lmax[i - 1], arr[i]);
    }
    for(int i = arr.length - 2;i>=0;i--){
      rmax[i] = Math.max(rmax[i + 1], arr[i]);
    }
    int res = 0;
    for(int i = 0;i<arr.length;i++){
      res += Math.max(0, Math.min(lmax[i], rmax[i]) - arr[i]);
    }
    return res;
  }
}
