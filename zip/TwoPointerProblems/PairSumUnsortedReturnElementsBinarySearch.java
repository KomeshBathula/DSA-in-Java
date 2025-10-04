import java.util.Arrays;
import java.util.Scanner;
public class PairSumUnsortedReturnElementsBinarySearch {

    public static int binarySearch(int[] arr, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid; 
            } else if (arr[mid] < target) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }
        return -1; 
    }
    public static int[] findPair(int[] arr, int target) {
        Arrays.sort(arr); 
        for (int i = 0; i < arr.length; i++) {
            int comp = target - arr[i];
            if (binarySearch(arr, i + 1, arr.length - 1, comp) != -1) {
                return new int[]{arr[i], comp};
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int target =sc.nextInt();
        sc.close();
        int p[]=findPair(arr,target);
        if (p == null) {
            System.out.println("No pair");
        } else {
            System.out.println(p[0] + ", " + p[1]);
        }
    }
}
