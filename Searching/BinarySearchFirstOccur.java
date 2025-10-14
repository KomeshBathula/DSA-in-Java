package Searching;
public class BinarySearchFirstOccur {
  public static void main(String[] args) {
    int arr[] = {3,3,4,4,4,4,4,8,8,8,8,9,9};
    System.out.println(binarySearchFirstOccur(arr, 9));
  }
  static int binarySearchFirstOccur(int arr[], int target){
    int l = 0, h = arr.length - 1;
    while(l<h){
      int m = (l+h)/2;
      if(target == arr[m]){
        if(m > 0 && arr[m-1] == target){
          h = m - 1;
          //l = 0;
        }
        else return m;
      }
      else if(arr[m]<target) l = m + 1;
      else h = m - 1;
    }
    return -1;
  }
}
