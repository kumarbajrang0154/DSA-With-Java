package dsa.recursion;
import java.util.*;
public class Print1ToN {
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
        counter(n-1);
        System.out.print(n +" ");
    }
}
