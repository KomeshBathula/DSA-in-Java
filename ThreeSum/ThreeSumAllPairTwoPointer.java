package ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumAllPairTwoPointer {
  public static void main(String[] args) {
    int arr[]  = {2,6,3,9,12,5,15};
    List<List<Integer>> res = threeSumPair(arr, 18);
    for(List<Integer> triplet : res) {
      System.out.println(triplet);
    }
  }
  static List<List<Integer>> threeSumPair(int arr[], int target){
    Arrays.sort(arr);
    List<List<Integer>> res = new ArrayList<>();
    for(int i = 0;i<arr.length - 2;i++){
      int l = i + 1, r = arr.length - 1;
      while(l<r){
        int s = arr[i] + arr[l] + arr[r];
        if(s == target){
          List<Integer> ilist = new ArrayList<>();
          ilist.add(arr[i]);
          ilist.add(arr[l]);
          ilist.add(arr[r]);
          res.add(ilist);
          l++;
          r--;
        }
        else if(s<target) l++;
        else r--;
      }
    }
    if(res.isEmpty()) {
      res.add(Arrays.asList(-1,-1,-1));
    }
    return res;
  }
}
