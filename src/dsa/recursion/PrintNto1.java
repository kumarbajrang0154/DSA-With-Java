package dsa.recursion;
import java.util.*;
public class PrintNto1 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter last digit: ");
        int n = in.nextInt();
        counter(n);
    }

    static void counter(int n){
        if (n == 0){
            return;
        }
        System.out.print(n + " ");
        counter(n - 1);
    }
}
