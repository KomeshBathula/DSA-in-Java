import java.util.HashSet;
import java.util.Scanner;
public class PairSumSortedVerifyHashing {
    public static boolean hasPair(int[] arr, int target) {
        HashSet<Integer> seen = new HashSet<>();
        for (int v : arr) {
            if (seen.contains(target - v)) return true;
            seen.add(v);
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
