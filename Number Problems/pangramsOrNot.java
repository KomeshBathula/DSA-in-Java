import java.util.HashMap;

public class pangramsOrNot {
  public static void main(String[] args) {
    //System.out.println(usingHashMap("The quick brown fox jumps over the lazy dog"));
    //System.out.println(usingArray("The quick brown fox jumps over the lazy dog"));
    System.out.println(usingContainsMethod("The quick brown fox jumps over the lazy dog"));
  }
  static boolean usingHashMap(String s1){
    if(s1.length()<26) return false;
    s1 = s1.toLowerCase();
    HashMap<Character,Integer> hm = new HashMap<>();
    for(int i=0;i<s1.length();i++){
      char ch = s1.charAt(i);
      if(ch<='z' && ch>='a') 
        hm.put(ch, hm.getOrDefault(ch, 0)+1);
    }
    if(hm.size() == 26) return true;
    return false;
  }

  static boolean usingArray(String s){
    if(s.length()<26) return false;
    s = s.toLowerCase();
    int pan[] = new int[26];
    for(int i=0;i<s.length();i++){
      char ch = s.charAt(i);
      if(ch<='z' && ch>='a') pan[ch-'a']++;
    }
    for(int i=0;i<26;i++){
      if(pan[i] == 0) return false;
    }
    return true;
  }

  static boolean usingContainsMethod(String s){
    String s1 = "abcdefghijklmnopqrstuvwxyz";
    for(int i=0;i<s1.length();i++){
      if(s.indexOf(s1.charAt(i)) == -1 ) return false;
    }
    return true;
  }
}
