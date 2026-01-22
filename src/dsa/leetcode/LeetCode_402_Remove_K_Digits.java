// LeetCode 402 – Remove K Digits

import java.util.*;
public class LeetCode_402_Remove_K_Digits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String num = sc.nextLine();
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        String result = removeKdigits(num, k);
        System.out.println("Resulting number after removing " + k + " digits: " + result);
        sc.close();
    }

    static String removeKdigits(String num, int k) {
        if (k == num.length()) return "0";
        StringBuilder stack = new StringBuilder();
        for (char digit : num.toCharArray()) {
            while (k > 0 && stack.length() > 0 &&
                   stack.charAt(stack.length() - 1) > digit) {
                stack.deleteCharAt(stack.length() - 1);
                k--;
            }
            stack.append(digit);
        }
        while (k > 0 && stack.length() > 0) {
            stack.deleteCharAt(stack.length() - 1);
            k--;
        }
        int index = 0;
        while (index < stack.length() && stack.charAt(index) == '0') {
            index++;
        }
        String result = stack.substring(index);
        return result.isEmpty() ? "0" : result;
    }
}
