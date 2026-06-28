import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> resSet = new HashSet<>();

        for (int n : nums1) set1.add(n);

        for (int n : nums2) {
            if (set1.contains(n)) {
                resSet.add(n);
            }
        }

        int[] res = new int[resSet.size()];
        int i = 0;
        for (int n : resSet) {
            res[i++] = n;
        }

        return res;
    }
}
