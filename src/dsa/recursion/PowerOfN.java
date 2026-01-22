package dsa.recursion;
import java.util.*;
public class PowerOfN {
    static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int m = in.nextInt();
        System.out.print("Enter power number: ");
        int n = in.nextInt();
        int result = power(m,n);
        System.out.println("Power " + n + " of base " + m + " : " + result);
    }

    static int power(int a, int b){
        if (b == 0) {
            return 1;
        }
        return a * power(a, b-1);
    }
}
