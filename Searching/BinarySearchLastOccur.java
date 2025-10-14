package Searching;
public class BinarySearchLastOccur {
  public static void main(String[] args) {
    int arr[] = {2,3,3,3,8,8,8,8,8,12,14,14,14};
    System.out.println(binarySearchLastOccur(arr, 14));
  }
  static int binarySearchLastOccur(int arr[], int target){
    int l = 0, h = arr.length - 1;
    while(l<=h){
      int m = (l+h)/2;
      if(target == arr[m]){
        if(m<arr.length - 1 && arr[m+1] == target){
          l = m + 1;
        }
        else return m;
      }
      else if(arr[m]<target){ l = m + 1;
      //System.out.println(l);
      }
      else{ h = m - 1;
      //System.out.println(h);
      }
    }
    return -1;
  }
}
