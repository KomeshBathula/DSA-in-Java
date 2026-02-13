import java.util.HashMap;
import java.util.Scanner;
public class PairSumSortedReturnIndicesHashing {
    public static int[] findIndices(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int comp = target - arr[i];
            if (map.containsKey(comp)) return new int[]{map.get(comp), i};
            if (!map.containsKey(arr[i])) map.put(arr[i], i);
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
        int[] idx = findIndices(arr, target); 
        System.out.println(idx==null ? "No pair" : ("Indices: " + idx[0] + ", " + idx[1]));
    }
}
