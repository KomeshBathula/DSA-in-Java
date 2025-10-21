package Searching;

public class SearchInRotatedSortedArray {
  public static void main(String[] args) {
    int arr[] = {8,11,13,15,17,1,4,6};
    //System.out.println(11/2);
    System.out.println(searchInRotatedArray(arr, 4));
  }
  static int searchInRotatedArray(int arr[], int target){
    int l = 0, r = arr.length - 1;
    while(l<=r){
      int mid = (l+r)/2;
      if(arr[mid] == target) 
        return mid;
      //left sorted array
      else if((arr[l]<=arr[mid])){
        if((target>=arr[l] && target<=arr[mid])) r = mid - 1;
        else l = mid + 1;
      }
      //right sorted array
      else {
        if(target>=arr[mid] && target<=arr[r]) l = mid + 1;
        else r = mid - 1;
      }
    }
    return -1;
  }
}
