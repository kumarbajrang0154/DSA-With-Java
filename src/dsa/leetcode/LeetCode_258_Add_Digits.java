// LeetCode 258 – Add Digits

import java.util.*;
public class LeetCode_258_Add_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int num = sc.nextInt();
        int result = addDigits(num);
        System.out.println("The result of adding digits of " + num + " is: " + result);
    }
    static int addDigits(int num) {
        if (num == 0) return 0;
        return 1 + (num - 1) % 9;
    }
}
