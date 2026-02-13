package ThreeSum;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ThreeSumAllPairHash {
  public static void main(String[] args) {
    int arr[]  = {1,2,3,4,5,6,7,8,9};
    List<List<Integer>> res = threeSumPair(arr, 15);
    for(List<Integer> triplet : res) {
      System.out.println(triplet);
    }
  }
  static List<List<Integer>> threeSumPair(int arr[], int target){
    List<List<Integer>> res = new ArrayList<>();
    for(int i = 0;i<arr.length;i++){
      HashSet<Integer> set = new HashSet<>();
      for(int j = i + 1;j<arr.length;j++){
        int diff = target - (arr[i] + arr[j]);
        if(set.contains(diff)){
          List<Integer> triplet = new ArrayList<>();
          triplet.add(arr[i]);
          triplet.add(arr[j]);
          triplet.add(diff);
          res.add(triplet);
        }
        set.add(arr[j]);
      }
    }
    if(res.isEmpty()) {
      res.add(List.of(-1, -1, -1));
    }
    return res;
  }
}
