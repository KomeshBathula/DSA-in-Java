public class RemoveAdjDupChars {
  public static void main(String[] args) {
    System.out.println(removeAdjacentDuplicates("aaabbcccaaadd"));
  }
  static String removeAdjacentDuplicates(String s){
    int i = 0, j = i + 1;
    StringBuilder sb = new StringBuilder();
    while(j<s.length()){
      if(s.charAt(i) == s.charAt(j)) j ++;
      else{
        sb.append(s.charAt(i));
        i = j;
        j = i + 1;
      }
    }
    if(i < s.length()) sb.append(s.charAt(i));
    return sb.toString();
  }
}
