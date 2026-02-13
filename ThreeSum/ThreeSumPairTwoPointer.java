package ThreeSum;

import java.util.Arrays;

public class ThreeSumPairTwoPointer {
  public static void main(String[] args) {
    int arr[]  = {2,6,3,9,12,5,15};
    int res[] = threeSumExistsOrNot(arr, 18);
    for(int i = 0;i<res.length;i++){
      System.out.println(res[i]);
    }
  }
  static int[] threeSumExistsOrNot(int arr[], int target){
    Arrays.sort(arr);
    int res[] = {-1,-1,-1};
    for(int i = 0;i<arr.length - 2;i++){
      int l = i + 1, r = arr.length - 1;
      while(l<r){
        int s = arr[i] + arr[l] + arr[r];
        if(s == target) return new int[]{arr[i], arr[l], arr[r]};
        else if(s<target) l++;
        else r--;
      }
    }
    return res;
  }
}
