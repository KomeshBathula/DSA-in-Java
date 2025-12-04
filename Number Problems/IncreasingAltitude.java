public class IncreasingAltitude {
  public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,3,2};
    find(arr, 7);
  }

  static void find(int arr[], int n){
    int count = 0;
    for(int i = 0;i<n-1;i++){
      if(arr[i+1]>arr[i]) count++;
      else if(arr[i+1]< arr[i]) count--;
    }
    System.out.println(count);
  }
}
