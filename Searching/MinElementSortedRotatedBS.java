package Searching;

public class MinElementSortedRotatedBS {
  public static void main(String[] args) {
    int arr[] = {11,12,13,14,15,1,2};
    System.out.println(getMinElement(arr));
  }
  static int getMinElement(int arr[]) {
    int low = 0, high = arr.length - 1;
    while (low < high) {
      int mid = (low+high) / 2;
      if (arr[mid] > arr[high])
        low = mid + 1;
      else 
        high = mid;
    }
    return arr[low];
  }
}
