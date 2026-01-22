package dsa.recursion;

import java.util.*;

public class RecursionFactor {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int ans = fact(num);
        System.out.println(ans);
    }

    static int fact(int num){
        if (num == 0){
            return 1;
        }
        return num * fact(num - 1);
    }
}
