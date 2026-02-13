import java.util.Scanner;
public class SortSquaresTwoPointer {
    public static int[] sortSquares(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        int l= 0, r=n-1;
        int pos=n-1;
        while (l<=r) {
            int ls =arr[l]*arr[l];
            int rs =arr[r]*arr[r];
            if (ls>rs) {
                res[pos--]=ls;
                l++;
            } else {
                res[pos--]=rs;
                r--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter sorted array elements :");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int[] res= sortSquares(arr);
        System.out.println("Sorted squares: " );
        for(int i:res) System.out.print(i +" ");
    }
}
