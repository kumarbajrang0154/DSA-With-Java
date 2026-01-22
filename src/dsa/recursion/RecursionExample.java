package dsa.recursion;
import java.util.Scanner;
public class RecursionExample {
    static void main(String[] args) {
        print(1);
    }

    static void print(int n){
        if (n > 10){
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}