package Searching;

public class SentinelSearch {
  public static void main(String[] args) {
    int arr[] = {4,3,7,1,6,2,9,56};
    System.out.println(sentinelSearch(arr, 8,9));
  }
  static int sentinelSearch(int arr[], int n, int target){
    int last = arr[n-1];
    arr[n-1] = target;
    int i = 0;
    while(arr[i] != target) i++;
    arr[n-1] = last;
    if(i<n-1 || arr[n-1] == target) return i;
    return -1;
  }
}
