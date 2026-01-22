// LeetCode 169 – Majority Element

import java.util.*;
public class LeetCode_169_Majority_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(majorityElement(nums));
        sc.close();
    }
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int majorityCount = nums.length / 2;

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if (countMap.get(num) > majorityCount) {
                return num;
            }
        }
        return -1; // This line should never be reached if input is valid
    }
}
