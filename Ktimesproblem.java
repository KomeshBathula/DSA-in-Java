import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;
class Ktimesproblem{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int no_of_elements = sc.nextInt();
    int arr[] = new int[no_of_elements];
    for(int i=0;i<no_of_elements;i++) arr[i] = sc.nextInt();
    int k = sc.nextInt();
    returnKTimes(arr, k);
    sc.close();
  }
  static void returnKTimes(int arr[], int k){
    LinkedHashMap<Integer,Integer> lhm = new LinkedHashMap<>();
    //int count = 0;
    for(int i=0;i<arr.length;i++){
      lhm.put(arr[i],lhm.getOrDefault(arr[i], 0)+1);

    }
    for(Map.Entry<Integer,Integer> e: lhm.entrySet()){
      Integer key = e.getKey();
      Integer value = e.getValue();
      if(value==k) System.out.println(key);
    }
  }
}

//occurs at least k times
class Ktimesproblem2{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int no_of_elements = sc.nextInt();
    int arr[] = new int[no_of_elements];
    for(int i=0;i<no_of_elements;i++) arr[i] = sc.nextInt();
    int k = sc.nextInt();
    returnKTimes(arr,k);
    sc.close();
  }
  static void returnKTimes(int arr[],int k){
    LinkedHashMap<Integer,Integer> lhm = new LinkedHashMap<>();
    //int count = 0;
    for(int i=0;i<arr.length;i++){
      lhm.put(arr[i],lhm.getOrDefault(arr[i], 0)+1);

    }
    for(Map.Entry<Integer,Integer> e: lhm.entrySet()){
      Integer key = e.getKey();
      Integer value = e.getValue();
      if(value>=k) System.out.println(key);
    }
  }
}

//occurs at most k times
class Ktimesproblem3{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int no_of_elements = sc.nextInt();
    int arr[] = new int[no_of_elements];
    for(int i=0;i<no_of_elements;i++) arr[i] = sc.nextInt();
    int k = sc.nextInt();
    returnKTimes(arr,k);
    sc.close();
  }
  static void returnKTimes(int arr[],int k){
    LinkedHashMap<Integer,Integer> lhm = new LinkedHashMap<>();
    //int count = 0;
    for(int i=0;i<arr.length;i++){
      lhm.put(arr[i],lhm.getOrDefault(arr[i], 0)+1);

    }
    for(Map.Entry<Integer,Integer> e: lhm.entrySet()){
      Integer key = e.getKey();
      Integer value = e.getValue();
      if(value<=k) System.out.println(key);
    }
  }
}
