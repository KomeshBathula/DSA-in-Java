package Searching;

public class BinarySearchIndexRec{
  public static void main(String[] args) {
    int arr[] = {1, 2, 5, 6, 7, 9, 10};
    int target = 5;
    System.out.println(binarySearch(arr, 0, arr.length-1, target));
  }
  static int binarySearch(int[] arr, int l, int r, int target){
    if (l <= r) {
      int mid = l + (r - l) / 2;
      if (arr[mid] == target) {
        return mid;
      } 
      else if (arr[mid] < target) {
        return binarySearch(arr, mid + 1, r, target);
      }
      else {
        return binarySearch(arr, l, mid - 1, target);
      }
    }
    return -1;
  }
}
