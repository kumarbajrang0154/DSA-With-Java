package dsa.recursion;
import java.util.*;
public class SumOfN {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int result = sum(n);
        System.out.println("Sum is: " + result);
    }

    static int sum(int num){
        if(num == 0){
            return 0;
        }
        return num + sum(num - 1);
    }
}
