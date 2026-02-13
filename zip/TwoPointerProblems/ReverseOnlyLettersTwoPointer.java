import java.util.Scanner;

public class ReverseOnlyLettersTwoPointer {
    public static String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int l=0,r=arr.length - 1;
        while (l<r) {
            if (!Character.isLetter(arr[l])) {
                l++;
            } else if (!Character.isLetter(arr[r])) {
                r--;
            } else {
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("Reversed letters string: " + reverseOnlyLetters(s));
    }
}
