public class EncodeString2 {
  public static void main(String[] args) {
    System.out.println(encode("azby"));
  }
  static String encode(String s){
    StringBuilder sb = new StringBuilder();
    for(int i = 0;i<s.length();i++){
      char ch ;
      if(i%2 == 0) ch = (char)(s.charAt(i) - 1);
      else ch = (char)(s.charAt(i) + 1);
      sb.append(ch);
    }
    return sb.toString();
  }
}
