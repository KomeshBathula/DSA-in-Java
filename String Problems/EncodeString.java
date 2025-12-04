public class EncodeString {
  public static void main(String[] args) {
    System.out.println(encode("azby"));
  }
  static String encode(String s){
    StringBuilder sb = new StringBuilder();
    for(int i = 0;i<s.length();i++){
      char ch = s.charAt(i);
      if(i%2 == 0){
        if(ch == 'a') ch = 'z'; 
        else ch = (char)(s.charAt(i) - 1);
      }
      else{
        if(ch == 'z') ch = 'a'; 
        else ch = (char)(s.charAt(i) + 1);
      }
      sb.append(ch);
    }
    return sb.toString();
  }
}
