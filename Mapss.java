import java.util.Scanner;
import java.util.TreeMap;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
class Frequency{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int no_of_elements = sc.nextInt();
    int arr[] = new int[no_of_elements];
    for(int i=0;i<no_of_elements;i++) arr[i] = sc.nextInt();
    //int k = sc.nextInt();
    returnKTimes(arr);
    sc.close();
  }
  static void returnKTimes(int arr[]){
    LinkedHashMap<Integer,Integer> lhm = new LinkedHashMap<>();
    //int count = 0;
    for(int i=0;i<arr.length;i++){
      lhm.put(arr[i],lhm.getOrDefault(arr[i], 0)+1);

    }
    for(Map.Entry<Integer,Integer> e: lhm.entrySet()){
      Integer key = e.getKey();
      Integer value = e.getValue();
      System.out.println(key+" "+value);
    }
  }
}

class TreeMapAscendingOrder{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int no_of_elements = sc.nextInt();
    int arr[] = new int[no_of_elements];
    for(int i=0;i<no_of_elements;i++) arr[i] = sc.nextInt();
    //int k = sc.nextInt();
    printAscOder(arr);
    sc.close();
  }
  static void printAscOder(int arr[]){
    TreeMap<Integer,Integer> tm = new TreeMap<>();
    for(int i=0;i<arr.length;i++) tm.put(i, arr[i]);
    Set<Integer> s = tm.keySet();
    for(Integer x:s) System.out.println(x+" "+tm.get(x));
  }
}

class TreeMapDescendingOrder{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int no_of_elements = sc.nextInt();
    int arr[] = new int[no_of_elements];
    for(int i=0;i<no_of_elements;i++) arr[i] = sc.nextInt();
    //int k = sc.nextInt();
    printAscOder(arr);
    sc.close();
  }
  static void printAscOder(int arr[]){
    TreeMap<Integer,Integer> tm = new TreeMap<>(Collections.reverseOrder());
    for(int i=0;i<arr.length;i++) tm.put(i, arr[i]);
    Set<Integer> s = tm.keySet();
    for(Integer x:s) System.out.println(x+" "+tm.get(x));
  }
}