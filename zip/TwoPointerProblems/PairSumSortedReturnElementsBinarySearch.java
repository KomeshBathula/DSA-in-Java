import java.util.Scanner;
public class PairSumSortedReturnElementsBinarySearch {
    public static int binarySearch(int[] arr, int lo, int hi, int target) {
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) lo = mid + 1;
            else hi = mid - 1;
        }
        return -1; 
    }
    public static int[] findPair(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            int comp = target - arr[i];
            int idx = binarySearch(arr, i + 1, arr.length - 1, comp);
            if (idx != -1) {
                return new int[]{arr[i], arr[idx]};
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
        int target = sc.nextInt();
        sc.close();
        int[] p = findPair(arr, target);
        System.out.println(p == null ? "No pair" : (p[0] + ", " + p[1]));
    }
}
