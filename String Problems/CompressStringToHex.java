public class CompressStringToHex {
  public static void main(String[] args) {
    System.out.println(compress("aabbbbbbbbbbbbcccccccccccccccdd"));
  }
  static String compress(String s){
    char ch = s.charAt(0);
    int count = 1;
    StringBuilder sb = new StringBuilder();
    for(int i = 1;i<s.length();i++){
      if(s.charAt(i) == ch){
        count++;
        ch = s.charAt(i);
      }
      else{
        sb.append(s.charAt(i - 1));
        sb.append(Integer.toHexString(count));
        ch = s.charAt(i);
        count = 1;
      }
    }
    sb.append(ch);
    sb.append(String.valueOf(Integer.toHexString(count)));
    return sb.toString();
  }
}
