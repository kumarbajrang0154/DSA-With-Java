// LeetCode 27: Remove Element

import java.util.*;
public class LeetCode_27_Remove_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        System.out.print("Enter the value to be removed: ");
        int val = sc.nextInt();
        int newLength = removeElement(array, val);
        System.out.println("New length of the array after removing " + val + " is: " + newLength);
        sc.close();
    }
    static int removeElement(int[] nums, int val) {
        int k = 0; // Pointer for the position of the next non-val element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
