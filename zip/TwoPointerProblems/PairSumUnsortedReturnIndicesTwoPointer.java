import java.util.Arrays;
import java.util.Scanner;
public class PairSumUnsortedReturnIndicesTwoPointer {

    public static int[] findPairIndices(int[] arr, int target) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        int l = 0, r = copy.length - 1;
        while (l < r) {
            int sum = copy[l] + copy[r];
            if (sum == target) {
                int idx1 = -1, idx2 = -1;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == copy[l] && idx1 == -1) {
                        idx1 = i;
                    } else if (arr[i] == copy[r] && idx2 == -1) {
                        idx2 = i;
                    }
                }
                return new int[]{idx1, idx2};
            }
            if (sum < target) {
                l++;
            } else {
                r--;
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
        int idx[]=findPairIndices(arr, target);
        System.out.println(idx == null ? "No pair" : ("Indices: " + idx[0] + ", " + idx[1]));
    }
}
