import java.util.HashSet;
import java.util.Scanner;
public class PairSumUnsortedVerifyHashing {
    public static boolean hasPair(int[] arr, int target) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int target =sc.nextInt();
        sc.close();
        System.out.println("Pair exists? " + hasPair(arr, target));
    }
}
