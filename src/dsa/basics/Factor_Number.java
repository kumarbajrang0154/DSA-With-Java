import java.util.*;
public class Factor_Number {
    // Function to find factors of a number
    public static void findFactors(int num) {
        System.out.print("Factors of " + num + " are: ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter a number to find its factors: ");
        int num = sc.nextInt();

        findFactors(num);

        sc.close();
    }
}
