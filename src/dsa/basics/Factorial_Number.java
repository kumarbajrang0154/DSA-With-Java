import java.util.*;
public class Factorial_Number {

    // Function to calculate factorial of a number
    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find its factorial: ");
        int num = sc.nextInt();

        long fact = factorial(num);
        System.out.println("Factorial of " + num + " is: " + fact);

        sc.close();
    }
}