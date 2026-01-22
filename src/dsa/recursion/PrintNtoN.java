package dsa.recursion;
import java.util.*;
public class PrintNtoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        printer(n);
    }

    static void printer(int n){
    if(n == 0){
        return;
    }

    System.out.print(n + " ");
    printer(n - 1);

    if(n != 1){
        System.out.print(n + " ");
    }
}

}
