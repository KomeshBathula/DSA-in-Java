import java.util.Scanner;
public class PairSumSortedReturnElementsTwoPointer {
    public static int[] findPair(int[] arr, int target) {
        int l=0, r=arr.length-1;
        while (l<r) {
            int s = arr[l] + arr[r];
            if (s == target) return new int[]{arr[l], arr[r]};
            if (s < target) l++; else r--;
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
        int[] p = findPair(arr, target);
        System.out.println(p==null ? "No pair" : (p[0] + ", " + p[1]));
    }
}
