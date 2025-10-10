package ThreeSum;

import java.util.Arrays;

public class ThreeSumExistsTwoPointer {
  public static void main(String[] args) {
    int arr[]  = {2,6,3,9,12,5,15};
    System.out.println(threeSumExistsOrNot(arr, 18));
  }
  static boolean threeSumExistsOrNot(int arr[], int target){
    Arrays.sort(arr);
    for(int i = 0;i<arr.length - 2;i++){
      int l = i + 1, r = arr.length - 1;
      while(l<r){
        int s = arr[i] + arr[l] + arr[r];
        if(s == target) return true;
        else if(s<target) l++;
        else r--;
      }
    }
    return false;
  }
}
