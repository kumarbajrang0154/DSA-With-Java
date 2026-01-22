package dsa.recursion;
import java.util.*;
public class N_Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        fibSeries(0,1,n);
    }

    static void fibSeries(int a, int b, int n){
        if (n == 0) {
            return;
        }
        System.out.print(a + " ");
        fibSeries(b, a + b, n - 1);
    }
}
