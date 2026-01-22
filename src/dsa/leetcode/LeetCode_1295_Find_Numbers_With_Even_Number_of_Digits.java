// LeetCode 1295 – Find Numbers with Even Number of Digits

import java.util.*;
public class LeetCode_1295_Find_Numbers_With_Even_Number_of_Digits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        int result = findNumbers(array);
        System.out.println("Number of elements with even number of digits: " + result);
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int digits = 0;
            while (num > 0) {
                digits++;
                num /= 10;
            }
            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
