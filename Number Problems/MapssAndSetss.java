import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Map;

class HashSetUsingArray{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<arr.length;i++) arr[i] = sc.nextInt();
    hashsetarray(arr);
    sc.close();
  }
  static void hashsetarray(int[] arr){
    HashSet<Integer> hs = new HashSet<>();
    for(int i=0;i<arr.length;i++) hs.add(arr[i]);
    System.out.println("In HashSet:");
    for(Integer x:hs) System.out.print(x+" ");
  }
}

class hashsetLinked{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<arr.length;i++) arr[i] = sc.nextInt();
    hashsetlinked(arr);
    sc.close();
  }
  static void hashsetlinked(int [] arr){
    LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
    for(int i=0;i<arr.length;i++) lhs.add(arr[i]);
    for(Integer x:lhs) System.out.print(x+" ");
  }
}


class TreeSetLinked{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<arr.length;i++) arr[i] = sc.nextInt();
    treesetlinked(arr);
    sc.close();
  }
  static void treesetlinked(int [] arr){
    TreeSet<Integer> ts = new TreeSet<>();
    for(int i=0;i<arr.length;i++) ts.add(arr[i]);
    for(Integer x:ts) System.out.print(x+" ");
  }
}

class Frequency2Times{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<arr.length;i++) arr[i] = sc.nextInt();
    freq2times(arr);
    sc.close();
  }
  static void freq2times(int [] arr){
    LinkedHashMap<Integer,Integer> lhm = new LinkedHashMap<>();
    for(int i=0;i<arr.length;i++)
    lhm.put(arr[i],lhm.getOrDefault(arr[i], 0)+1);
    for(Map.Entry<Integer,Integer> e: lhm.entrySet()){
      Integer key = e.getKey();
      Integer value = e.getValue();

      if(value==2) {
        System.out.println("elem with 2 times");
        System.out.println(key);
      }
    }
  }
}


class FrequencyAtLeast2Times{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<arr.length;i++) arr[i] = sc.nextInt();
    freqatleast2times(arr);
    sc.close();
  }
  static void freqatleast2times(int [] arr){
    LinkedHashMap<Integer,Integer> lhm = new LinkedHashMap<>();
    for(int i=0;i<arr.length;i++)
    lhm.put(arr[i],lhm.getOrDefault(arr[i], 0)+1);
    for(Map.Entry<Integer,Integer> e: lhm.entrySet()){
      Integer key = e.getKey();
      Integer value = e.getValue();

      if(value>=2) {
        System.out.println("elem with 2 times");
        System.out.println(key);
      }
    }
  }
}


class FrequencyAtMost2Times{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<arr.length;i++) arr[i] = sc.nextInt();
    freqatmost2times(arr);
    sc.close();
  }
  static void freqatmost2times(int [] arr){
    LinkedHashMap<Integer,Integer> lhm = new LinkedHashMap<>();
    for(int i=0;i<arr.length;i++)
    lhm.put(arr[i],lhm.getOrDefault(arr[i], 0)+1);
    for(Map.Entry<Integer,Integer> e: lhm.entrySet()){
      Integer key = e.getKey();
      Integer value = e.getValue();

      if(value<=2) {
        System.out.println("elem with 2 times");
        System.out.println(key);
      }
    }
  }
}