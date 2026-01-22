import java.util.*;

public class ArmstrongNumber {

    public static long armstrg(long num) {
        long temp = num;
        int len = Long.toString(num).length();
        long sum = 0;

        while (temp != 0) {
            long digit = temp % 10;
            sum += Math.pow(digit, len);
            temp /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        long result = armstrg(num);

        if (result == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is NOT an Armstrong number.");
        }

        sc.close();
    }
}
