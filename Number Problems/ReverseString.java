
public class ReverseString {
  public static void main(String[] args) {
    reverseString("i.like.this.program.very.much");
    reverseStringDots("......i.like.this.program.very.much.......");
  }
  static void reverseString(String s){
    String strarr[] = s.split("\\.");
    StringBuilder sb = new StringBuilder();
    for(int i = strarr.length-1;i>=0;i--){
      sb.append(strarr[i]);
      if(i>0) sb.append(".");
    }
    System.out.println(sb);
  }

  static void reverseStringDots(String s){
    s = s.replaceAll("^\\.+|\\.+$", "");
    String strarr[] = s.split("\\.");
    StringBuilder sb = new StringBuilder();
    for(int i = strarr.length-1;i>=0;i--){
      sb.append(strarr[i]);
      if(i>0) sb.append(".");
    }
    System.out.println(sb);
  }
}
