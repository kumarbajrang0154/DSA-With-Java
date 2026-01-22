package dsa.recursion;
import java.util.*;
public class SumDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digit: ");
        int n = sc.nextInt();
        int result = sum(n);
        System.out.println("Total sum of digit: " + result);
    }
    
    static int sum(int n){
        if (n == 0) {
            return 0;
        }
        int last = n % 10;
        return last + sum(n / 10);
    }
}
