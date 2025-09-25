import java.util.HashMap;
import java.util.HashSet;

public class isogramOrNot {
  public static void main(String[] args) {
    //System.out.println(isogramusingHashSet("machine"));
    //System.out.println(isogramUsingHashMap("geeks"));
    //System.out.println(isogramUsingFreqArrays("geeks"));
    System.out.println(Gram("geeks"));
  }
  static boolean isogramusingHashSet(String s){
    HashSet<Character> set = new HashSet<>();
    for(int i=0;i<s.length();i++){
      if(set.contains(s.charAt(i))) return false;
      set.add(s.charAt(i));
    }
    return true;
  }

  static boolean isogramUsingHashMap(String s){
    HashMap<Character, Integer> map = new HashMap<>();
    for(int i=0;i<s.length();i++){
      char ch = s.charAt(i);
      map.put(ch, map.getOrDefault(ch, 0)+1);
    }
    for(int i : map.values()){
      if(i>=2) return false;
    }
    return true;
  }

  static boolean isogramUsingFreqArrays(String s){
    int chars[] = new int[26];
    for(int i=0;i<s.length();i++){
      char ch = s.charAt(i);
      chars[ch-'a']++;
    }
    for(int i=0;i<chars.length;i++){
      if(chars[i]>1) return false;
    }
    return true;
  }

  static boolean usingString(String s){
    String sb = "abcdefghijklmnopqrstuvwxyz";
    for(int i=0;i<s.length();i++){
      char ch = s.charAt(i);
      if(ch.contains(sb))
    }
  }

    static boolean Gram(String s){
      System.out.println(s+" "+s.length());
      HashMap<Character,Integer> map = new HashMap<>();
      char ch=0;
      for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
      }
      int count=0;
      for(int i=0;i<s.length();i++){
          if(map.get(ch)==1){
              count++;
          }
      }
      System.out.println(map+" "+count);
      if(count==s.length()){
          return true;
      }
      return false;
  }
}
