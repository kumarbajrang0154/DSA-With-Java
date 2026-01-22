package dsa.recursion;
import java.util.*;
public class RecursionCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        print(num);
    }
    // This method will print the number in ascending order......
//    static void print(int num){
//        if (num == 0){
//            return;
//        }
//        print(num-1);
//        System.out.print(num + " ");
//    }


    // This method will print the number in descending order......
    static void print(int num){
        if (num == 0){
            return;
        }
        System.out.print(num + " ");
        print(num-1);
    }
}
