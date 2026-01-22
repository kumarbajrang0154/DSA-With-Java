// LeetCode 88 – Merge Sorted Array

import java.util.*;
public class LeetCode_88_Merge_Sorted_Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the first array (nums1): ");
        int m = sc.nextInt();
        System.out.print("Enter the number of elements in the second array (nums2): ");
        int n = sc.nextInt();

        int[] nums1 = new int[m + n];
        System.out.println("Enter the elements of the first sorted array (nums1): ");
        for(int i = 0; i < m; i++){
            nums1[i] = sc.nextInt();
        }

        int[] nums2 = new int[n];
        System.out.println("Enter the elements of the second sorted array (nums2): ");
        for(int i = 0; i < n; i++){
            nums2[i] = sc.nextInt();
        }

        merge(nums1, m, nums2, n);

        System.out.println("Merged sorted array: " + Arrays.toString(nums1));
        sc.close();
    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Pointer for the end of nums1's valid elements
        int j = n - 1; // Pointer for the end of nums2
        int k = m + n - 1; // Pointer for the end of nums1

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // If there are remaining elements in nums2, copy them
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}
