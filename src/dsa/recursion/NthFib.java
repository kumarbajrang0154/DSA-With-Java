package dsa.recursion;
import java.util.*;
public class NthFib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index: ");
        int n = sc.nextInt();
        int result = fibSeries(n);
        System.out.println(result);   
    }
    
    static int fibSeries(int n){
        if (n < 2) {
            return n;
        }
        return fibSeries(n-1) + fibSeries(n-2);
    }
}
