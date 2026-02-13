import java.util.Scanner;
public class ReverseString {
    public static String reverse(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str =sc.next();
        sc.close();
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reverse(str));
    }
}
