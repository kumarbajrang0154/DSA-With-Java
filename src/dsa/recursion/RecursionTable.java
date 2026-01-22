package dsa.recursion;
import java.util.*;

public class RecursionTable {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = in.nextInt();
        table(n);
    }

    static void table(int n) {
        table(n, 1);
    }

    static void table(int n, int s) {
        if (s > 10) {
            return;
        }
        System.out.println(n + " * " + s + " : " + (n * s));
        table(n, s + 1);
    }
}
