package dsa.recursion;
import java.util.*;
public class PrintEven {
    static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        printEven(num);
    }

    static void printEven(int num){
        if(num == 0){
            return;
        }
        printEven(num-1);
        if(num % 2 == 0){
            System.out.print(num + " ");
        }
    }
}
