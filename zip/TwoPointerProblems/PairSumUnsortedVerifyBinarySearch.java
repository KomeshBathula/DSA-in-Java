import java.util.Arrays;
import java.util.Scanner;
public class PairSumUnsortedVerifyBinarySearch {
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
    public static boolean hasPair(int[] arr, int target) {
        Arrays.sort(arr); 
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (binarySearch(arr, i + 1, arr.length - 1, complement) != -1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int target = sc.nextInt();
        sc.close();
        System.out.println("Pair exists? " + hasPair(arr, target));
    }
}
