import java.util.*;
public class Power_Number {

    // Function to calculate power of a number
    public static double power(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        double base = sc.nextDouble();

        System.out.print("Enter the exponent: ");
        int exponent = sc.nextInt();

        double result = power(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        sc.close();
    }
}