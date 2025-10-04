import java.util.Arrays;
import java.util.Scanner;

public class PairSumUnsortedReturnIndicesBinarySearch {
    public static int binarySearch(int[] arr, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
    public static int[] findPairIndices(int[] arr, int target) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        for (int i = 0; i < copy.length; i++) {
            int comp = target - copy[i];
            int found = binarySearch(copy, i + 1, copy.length - 1, comp);
            if (found != -1) {
                int idx1 = -1, idx2 = -1;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == copy[i] && idx1 == -1) idx1 = j;
                    else if (arr[j] == copy[found] && idx2 == -1) idx2 = j;
                }
                return new int[]{idx1, idx2};
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int target = sc.nextInt();
        sc.close();
        int[] idx = findPairIndices(arr, target);
        System.out.println(idx == null ? "No pair" : ("Indices: " + idx[0] + ", " + idx[1]));
    }
}
