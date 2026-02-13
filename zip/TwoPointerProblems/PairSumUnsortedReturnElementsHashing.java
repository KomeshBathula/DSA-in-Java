import java.util.HashSet;
import java.util.Scanner;
public class PairSumUnsortedReturnElementsHashing {
    public static int[] findPair(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int v : arr) {
            int comp = target - v;
            if (set.contains(comp)) {
                return new int[]{comp, v};
            }
            set.add(v);
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
        int p[]=findPair(arr,target);
        System.out.println(p == null ? "No pair" : (p[0] + ", " + p[1]));
    }
}
