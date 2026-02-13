package ThreeSum;

import java.util.HashSet;

public class ThreeSumPairHash {
  public static void main(String[] args) {
    int arr[]  = {2,6,3,9,12,5,15};
    int res[] = threeSumExistsOrNot(arr, 18);
    for(int i = 0;i<res.length;i++){
      System.out.println(res[i]);
    }
  }
  static int[] threeSumExistsOrNot(int arr[], int target){
    int res[] = {-1,-1,-1};
    for(int i = 0;i<arr.length;i++){
      HashSet<Integer> set = new HashSet<>();
      for(int j = i + 1;j<arr.length;j++){
        int diff = target - (arr[i] + arr[j]);
        if(set.contains(diff)) return new int[]{arr[i], arr[j], diff};
        set.add(arr[j]);
      }
    }
    return res;
  }
}
