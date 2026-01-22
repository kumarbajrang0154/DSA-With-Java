import java.util.*;
public class Fibonacci_Series {

    // Function to find Fibonacci series up to n terms
    public static void fibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci series up to " + n + " terms: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = sc.nextInt();

        fibonacci(n);

        sc.close();
    }
}