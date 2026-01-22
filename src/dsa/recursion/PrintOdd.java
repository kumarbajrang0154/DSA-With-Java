package dsa.recursion;
import java.util.*;
public class PrintOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        printOdd(num);
    }

    static void printOdd(int num){
        if (num ==0) {
            return;
        }
        
        printOdd(num-1);
        if (num % 2 != 0) {
            System.out.print(num + " ");
        }
    }
}
