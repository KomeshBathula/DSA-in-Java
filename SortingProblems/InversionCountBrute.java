package SortingProblems;
public class InversionCountBrute {
  public static void main(String[] args) {
    int arr[] = {4, 1, 3, 5, 2};
    int ans = m1(arr);
    System.out.println(ans);
  }
  static int m1(int arr[])
  {
    int c=0;
    for(int i=0;i<arr.length;i++)
    {
      for(int j=i+1;j<arr.length;j++)
      {
        if(arr[i]>arr[j])
        {
          c++;
        }
      }
    }
    return c;
  }
}
