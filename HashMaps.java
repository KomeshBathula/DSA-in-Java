import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
class HashMapUsingkeySetAndGet{
  public static void main(String[] args) {
    HashMap<Integer,String> hm = new HashMap<>();
    hm.put(1,"komesh");
    hm.put(2,"phani");
    hm.put(3,"balaji");
    Set<Integer> s = hm.keySet();
    System.out.println("key value");
    for(Integer x:s) System.out.println(x+"   "+hm.get(x));
  }
}

class HashMapUsingentrySet{
  public static void main(String[] args) {
    HashMap<Integer,String> hm = new HashMap<>();
    hm.put(1,"komesh");
    hm.put(2,"phani");
    hm.put(3,"balaji");
    System.out.println("key value");
    for(Map.Entry<Integer,String> e:hm.entrySet()){
      Integer key = e.getKey();
      String val = e.getValue();
      System.out.println(key+"   "+val);
    }
  }
}

class Frequency{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++) a[i] = sc.nextInt();
    HashMap<Integer,Integer> hm = new HashMap<>();
    for(int i=0;i<n;i++){
      hm.put(a[i],hm.getOrDefault(a[i],0)+1);
    }
    Set<Integer> s = hm.keySet();
    for(Integer x:s) System.out.println(x+" "+hm.get(x));
    sc.close();
  }
}

class FrequencyUsingArray{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++) a[i] = sc.nextInt();
    HashMap<Integer,Integer> hm = new HashMap<>();
    for(int i=0;i<n;i++){
      hm.put(a[i],hm.getOrDefault(a[i],0)+1);
    }
    for(int i=0;i<n;i++){
      if(hm.containsKey(a[i])){
        System.out.println(a[i]+" "+hm.get(a[i]));
        hm.remove(a[i]);
      }
    }
    sc.close();
  }
}