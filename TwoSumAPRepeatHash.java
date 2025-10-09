import java.util.*;
class TwoSumAPRepeatHash {
  public static void main(String[] args) {
    int arr[] = {2,4,4,5,5,5,7,9};
    List<List<Integer>> result = twoSumAllPairs(arr, 9);
    for (List<Integer> pair : result) {
      System.out.println(pair);
    }
  }
  static List<List<Integer>> twoSumAllPairs(int[] arr, int target) {
    List<List<Integer>> result = new ArrayList<>();
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i = 0;i<arr.length;i++){
      map.put(target-arr[i], map.getOrDefault(target-arr[i], 0) + 1);
      if(map.containsKey(arr[i])){
        for(int j =0;j<map.get(arr[i]);j++){
          ArrayList<Integer> list = new ArrayList<>();
          list.add(target-arr[i]);
          list.add(arr[i]);
          result.add(list);
        }
      }
    }
    return result;
  }
}
