import java.util.Scanner;

public class reversePalindrome {

    static boolean reverseCHecker(int num){
        int temp = num;
        int rev = 0;

        while (temp != 0) {
            int div = temp % 10;
            rev = rev*10+div;
            temp = temp/10;
        }

        if (rev == num) {
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a digit: ");
        int num = sc.nextInt();

        if (reverseCHecker(num)) {
            System.out.println(num+" is Palindrome.");
        }else{
            System.out.println(num+" is not Palindrome.");
        }

        sc.close();
    }
}
