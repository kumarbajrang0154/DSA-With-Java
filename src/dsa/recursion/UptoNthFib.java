package dsa.recursion;
import java.util.*;
public class UptoNthFib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        fibSeries(n, 0, 1);
    }

    static void fibSeries(int n, int a, int b){
        if (a > n) {
            return;
        }
        System.out.print(a + " ");
        fibSeries(n, b, a+b);
    }
}
