package dsa.recursion;
import java.util.*;
public class CounterDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digit: ");
        int n = sc.nextInt();
        int result = counter(n);
        System.out.println("Total number of digit: " + result);
    }

    static int counter(int n){
        if (n == 0) {
            return 0;
        }
        return 1 + counter(n / 10);
    }
}
