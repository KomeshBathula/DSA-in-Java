package ThreeSum;

import java.util.*;

public class ThreeSumAllPairBrute {
  public static void main(String[] args) {
    int arr[] = {2,6,3,9,12,5,1,15};
    List<List<Integer>> res = threeSumPair(arr, 18);
    for(List<Integer> triplet : res) {
      System.out.println(triplet);
    }
  }
  static List<List<Integer>> threeSumPair(int arr[], int target){
    List<List<Integer>> res = new ArrayList<>();
    for(int i = 0;i<arr.length;i++){
      for(int j = i + 1;j<arr.length;j++){
        for(int k = j + 1;k<arr.length;k++){
          if(arr[i] + arr[j] + arr[k] == target){
            List<Integer> triplet = new ArrayList<>();
            triplet.add(arr[i]);
            triplet.add(arr[j]);
            triplet.add(arr[k]);
            res.add(triplet);
          }
        }
      }
    }
    if(res.isEmpty()) res.add(Arrays.asList(-1,-1,-1));
    return res;
  }
}
