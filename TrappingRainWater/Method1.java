package TrappingRainWater;

public class Method1 {
  public static void main(String[] args) {
    int arr[] = {3,0,2,0,4};
    System.out.println(trapRain(arr));
  }
  static int trapRain(int arr[]){
    int lmax = arr[0], rmax = arr[arr.length - 1];
    int l = 0, r = arr.length - 1;
    int res = 0;
    while(l<=r){
      if(lmax <= rmax){
        lmax = Math.max(lmax, arr[l]);
        res += Math.max(0, lmax - arr[l]);
        l++;
      }
      else{
        rmax = Math.max(rmax, arr[r]);
        res += Math.max(0, rmax - arr[r]);
        r--;
      }
    }
    return res;
  }
}
