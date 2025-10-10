package ThreeSum;

import java.util.HashSet;

public class ThreeSumExistsHash {
  public static void main(String[] args) {
    int arr[]  = {2,6,3,9,12,5,15};
    System.out.println(threeSumExistsOrNot(arr, 18));
  }
  static boolean threeSumExistsOrNot(int arr[], int target){
    for(int i = 0;i<arr.length;i++){
      HashSet<Integer> set = new HashSet<>();
      for(int j = i + 1;j<arr.length;j++){
        int diff = target - (arr[i] + arr[j]);
        if(set.contains(diff)) return true;
        set.add(arr[j]);
      }
    }
    return false;
  }
}
