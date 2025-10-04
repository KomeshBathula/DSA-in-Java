import java.util.*;

public class TwoSumUnsortedHashingIndices {
    public static int[] getPairIndices(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>(); 
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(-arr[i])) {
                return new int[]{map.get(-arr[i]), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int[] result = getPairIndices(arr);
        System.out.println("Indices: " + result[0] + " " + result[1]);
    }
}
