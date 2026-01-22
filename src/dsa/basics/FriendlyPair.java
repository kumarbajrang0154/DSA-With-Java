import java.util.*;
public class FriendlyPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        if (isTrue(num1, num2)) {
            System.out.println(num1 + " and " + num2 + " are friendly pairs.");
        } else {
            System.out.println(num1 + " and " + num2 + " are not friendly pairs.");
        }
        // if (areFriendlyPairs(num1, num2)) {
        //     System.out.println(num1 + " and " + num2 + " are friendly pairs.");
        // } else {
        //     System.out.println(num1 + " and " + num2 + " are not friendly pairs.");
        // }
    }
    // static boolean areFriendlyPairs(int a, int b) {
    //     int sumDivA = sumOfDivisors(a);
    //     int sumDivB = sumOfDivisors(b);
    //     return (sumDivA * b) == (sumDivB * a);
    // }
    // static int sumOfDivisors(int n) {
    //     int sum = 0;
    //     for (int i = 1; i <= n / 2; i++) {
    //         if (n % i == 0) {
    //             sum += i;
    //         }
    //     }
    //     return sum;
    // }

    static int sumOfDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    static boolean isTrue(int a, int b){
        int sumDivA = sumOfDivisors(a);
        int sumDivB = sumOfDivisors(b);
        if (sumDivA == a && sumDivB == b) {
            return true;
        }
        return false;
    }
}
