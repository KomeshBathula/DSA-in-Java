import java.util.*;

public class TwoSumSortedHashingPair {
    public static int[] getPairWithZero(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(-num)) {
                return new int[]{num, -num};
            }
            set.add(num);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sorted array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int[] result = getPairWithZero(arr);
        System.out.println("Pair: " + result[0] + " " + result[1]);
    }
}
