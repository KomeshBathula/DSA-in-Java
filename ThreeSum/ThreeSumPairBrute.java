package ThreeSum;

public class ThreeSumPairBrute {
  public static void main(String[] args) {
    int arr[] = {2,6,3,9,12,5,1,15};
    int res[] = threeSumPair(arr, 18);
    for(int i = 0;i<res.length;i++){
      System.out.println(res[i]);
    }
  }
  static int[] threeSumPair(int arr[], int target){
    int res[] = {-1,-1,-1};
    for(int i = 0;i<arr.length;i++){
      for(int j = i + 1;j<arr.length;j++){
        for(int k = j + 1;k<arr.length;k++){
          if(arr[i] + arr[j] + arr[k] == target) return new int[]{arr[i], arr[j], arr[k]};
        }
      }
    }
    return res;
  }
}
