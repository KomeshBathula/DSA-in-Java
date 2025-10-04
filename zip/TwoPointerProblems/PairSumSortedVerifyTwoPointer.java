import java.util.Scanner;
public class PairSumSortedVerifyTwoPointer {
    public static boolean hasPair(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int s = arr[l] + arr[r];
            if (s == target) return true;
            if (s < target) l++; else r--;
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
