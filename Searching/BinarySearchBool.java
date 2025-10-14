package Searching;

public class BinarySearchBool {
  public static void main(String[] args) {
    int arr[] = {1, 2, 5, 6, 7, 9, 10};
    int target = 5;
    System.out.println(binarySearch(arr, target));
  }
  static boolean binarySearch(int[] arr, int target) {
    int l = 0;
    int r = arr.length - 1;
    while (l <= r) {
      int mid = l + (r - l) / 2;
      if (arr[mid] == target) {
        return true;
      } 
      else if (arr[mid] < target) {
        l = mid + 1;
      } 
      else {
        r = mid - 1;
      }
    }
    return false;
  }
}
