package SortingProblems;

public class InversionCountOptimal {
  public static void main(String[] args) {
    int arr[] = {4, 1, 3, 5, 2};
    System.out.println(mergeSort(arr, 0, arr.length - 1));
  }
  public static int mergeSort(int arr[], int low, int high){
    if(low >= high) return 0;
    int res = 0;
    int mid = (low+high)/2;
    //will go to infinite recursion calls if we split mid-1 and mid
    res += mergeSort(arr, low, mid);
    res += mergeSort(arr, mid+1, high);
    res += merge(arr, low, mid, high);
    return res;
  }
  public static int merge(int arr[], int low, int mid, int high){
    int temp[] = new int[arr.length];
    int left = low, right = mid+1;
    int idx = low;
    int cnt = 0;
    while(left<=mid && right<=high){
      if(arr[left]<=arr[right]){
        //System.out.println(arr[left]+ " ");
        temp[idx++] = arr[left];
        left ++;
      }
      else{
        //System.out.println(arr[right]+" ");
        temp[idx++] = arr[right];
        right ++;
        cnt += mid - left + 1;
      }
    }
    //left out elements in left sub array
    while(left<=mid){
      //System.out.println(arr[left]+" ");
      temp[idx++] = arr[left];
      left ++;
    }
    //right sub array left out elements
    while(right<=high){
      //System.out.println(arr[right]+" ");
      temp[idx++] = arr[right];
      right ++;
    }
    for(int i = low;i<=high;i++)
      arr[i] = temp[i];
    //for(int i : arr) System.out.print(i+" ");
    return cnt;
  }
}
