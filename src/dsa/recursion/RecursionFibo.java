package dsa.recursion;
import java.util.*;
public class RecursionFibo {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = in.nextInt();
        fibSeries(0,1,n);
        System.out.println();
        System.out.println(fibSeries(n));

    }

    // Fibonacci Series in sequence order...........
    static void fibSeries(int a, int b, int n) {
        if (n == 0) return;
        System.out.print(a + " ");
        fibSeries(b, a + b, n - 1);
    }


    // Nth Fibonacci Series...........
    static int fibSeries(int n){
        if (n < 2){
            return n;
        }
        return fibSeries(n-1) + fibSeries(n-2);
    }

}
