import java.util.*;

public class ArmstrongNumberRange {

    // Function to check if a number is Armstrong
    public static boolean isArmstrong(int num) {
        int temp = num;
        int len = Integer.toString(num).length();
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, len);
            temp /= 10;
        }

        return sum == num;
    }

    // Function to print Armstrong numbers in range
    public static void armstrongInRange(int st, int end) {
        System.out.println("Armstrong numbers between " + st + " and " + end + " are:");
        for (int i = st; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int st = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        armstrongInRange(st, end);

        sc.close();
    }
}
