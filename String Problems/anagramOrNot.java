import java.util.Arrays;
import java.util.HashMap;
public class anagramOrNot {
  public static void main(String[] args) {
    //System.out.println(usingStrings("racee","caree")); 
    //System.out.println(usingTwoHashMaps("race","cars"));
    //System.out.println(usingSingleHashMap("race","caree"));
    //System.out.println(usingTwoArrays("race","carE"));
    System.out.println(usingSingleArray("race","carE"));
  }
  static boolean usingStrings(String s1, String s2){
    if(s1.length() != s2.length()) return false;
    s1 = s1.toLowerCase();
    s2 = s2.toLowerCase();
    char chars1[] = s1.toCharArray();
    char chars2[] = s2.toCharArray();
    Arrays.sort(chars1);
    Arrays.sort(chars2);
    String s11 = "";
    String s22 = "";
    for(int i=0;i<chars1.length;i++){
      s11+=chars1[i];
      s22+=chars2[i];
    }
    if(s11.equals(s22)) return true;
    else return false;
  }

  static boolean usingTwoHashMaps(String s1, String s2){
    if(s1.length() != s2.length()) return false;
    s1=s1.toLowerCase();
    s2=s2.toLowerCase();
    HashMap<Character, Integer> hm1 = new HashMap<>();
    HashMap<Character, Integer> hm2 = new HashMap<>();
    for(int i=0;i<s1.length();i++){
      hm1.put(s1.charAt(i), hm1.getOrDefault(s1.charAt(i), 0) + 1);
      hm2.put(s2.charAt(i), hm2.getOrDefault(s2.charAt(i), 0) + 1);
    }
    return hm1.equals(hm2);
  }

  static boolean usingSingleHashMap(String s1, String s2){
    if(s1.length() != s2.length()) return false;
    s1=s1.toLowerCase();
    s2=s2.toLowerCase();
    HashMap<Character,Integer> hm = new HashMap<>();
    for(int i=0;i<s1.length();i++){
      hm.put(s1.charAt(i),hm.getOrDefault(s1.charAt(i), 0) + 1);
      hm.put(s2.charAt(i), hm.getOrDefault(s2.charAt(i),0) - 1);
    }
    for(int value : hm.values()){
      if(value!=0) return false;
    }
    return true;
  }

  static boolean usingTwoArrays(String s1, String s2){
    if(s1.length() != s2.length()) return false;
    char chara[] = new char[26];
    char charb[] = new char[26];
    s1 = s1.toLowerCase();
    s2 = s2.toLowerCase();
    for(int i=0;i<s1.length();i++){
      chara[s1.charAt(i)-'a']++;
      charb[s2.charAt(i)-'a']++;
    }
    for(int i=0;i<s1.length();i++){
      if(chara[i]!=charb[i]) return false;
    }
    return true;
  }

  static boolean usingSingleArray(String s1, String s2){
    if(s1.length() != s2.length()) return false;
    s1=s1.toLowerCase();
    char chara[] = new char[26];
    for(int i=0;i<s1.length();i++){
      chara[s1.charAt(i)-'a']++;
      chara[s2.charAt(i)-'a']--;
    }
    for(int i=0;i<s1.length();i++){
      if(chara[i] != 0) return false;
    }
    return true;
  }
}
