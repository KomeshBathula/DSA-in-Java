package Searching;

public class TernarySearchRec {
  public static void main(String[] args) {
    int arr[] = {1, 2, 5, 6, 7, 9, 10};
    int target = 10;
    System.out.println(ternarySearch(arr,0,arr.length-1, target));
  }
  static int ternarySearch(int[] arr,int l, int r, int target) {
    while (l <= r) {
      int m1 = l + (r - l) / 2;
      int m2 = r - (r - l)/2;
      if (arr[m1] == target) return m1;
      else if(arr[m2] == target) return m2;
      else if(target<arr[m1]) return ternarySearch(arr, l, m1 - 1, target);
      else if(target>arr[m2]) return ternarySearch(arr, m2 + 1, r, target);
      else if(target>arr[m1] && target<arr[m2]){
        l = m1 + 1;
        r = m2 - 1;
      }
    }
    return -1;
  }
}
