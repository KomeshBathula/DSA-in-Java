import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class FreqDecOrder {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0;i<arr.length;i++) arr[i] = sc.nextInt();
    usingTreeMap(arr, n);
    sc.close();
  }

  static void usingTreeMap(int arr[], int n){
    TreeMap<Integer, Integer> map = new TreeMap<>();
    for(int i = 0;i<n;i++) map.put(map.getOrDefault(arr[i], 0) + 1, arr[i]);
    ArrayList<Integer> list = new ArrayList<>();
    for(Map.Entry<Integer, Integer> e : map.entrySet()){
      for(int i = 0;i<e.getKey();i++) list.add(e.getValue());
    }
    for(Integer x : list) System.out.println(x);
  }
}
