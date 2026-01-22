import java.util.Scanner;

public class Palindrome1 {
    public static boolean isPalindrome(String str, int right, int left){
        if (left >= str.length() / 2) {
            return true;
        }
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        return isPalindrome(str, right-1, left+1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int left = 0;
        int right = str.length() - 1;
        boolean result = isPalindrome(str, right, left);
        if (result == true) {
            System.out.println("Palindrome.");
        }else{
            System.out.println("Not Plaindrome.");
        }
    }
}
