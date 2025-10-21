package Searching;

public class CountOfOccurencesUsingBS {
  public static void main(String[] args) {
    int arr[] = {2,6,9,9,9,9,9, 15,15,15,24,24};
    int first_occur = binarySearchFirstOccur(arr, 15);
    int last_occur = binarySearchLastOccur(arr,15);
    if(first_occur == -1 && last_occur == -1){
      System.out.println(0);
      System.exit(0);
    }
    int result = last_occur - first_occur + 1;
    System.out.println(result);
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
      }
      else{ h = m - 1;
      }
    }
    return -1;
  }
}
