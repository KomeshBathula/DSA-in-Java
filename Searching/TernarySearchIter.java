package Searching;

public class TernarySearchIter {
  public static void main(String[] args) {
    int arr[] = {1, 2, 5, 6, 7, 9, 10};
    int target = 7;
    System.out.println(ternarySearch(arr, target));
  }
  static int ternarySearch(int[] arr, int target) {
    int l = 0;
    int r = arr.length - 1;
    while (l <= r) {
      int m1 = l + (r - l) / 2;
      int m2 = r - (r - l)/2;
      if (arr[m1] == target) return m1;
      else if(arr[m2] == target) return m2;
      else if(target<arr[m1]) r = m1 - 1;
      else if(target>arr[m2]) l = m2 + 1;
      else if(target>arr[m1] && target<arr[m2]){
        l = m1 + 1;
        r = m2 - 1;
      }
    }
    return -1;
  }
}
