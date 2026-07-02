class Solution {

    public int splitArray(int[] nums, int k) {

        int low = findMax(nums);
        int high = findSum(nums);

        int ans = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (canSplit(nums, mid, k)) {

                ans = mid;
                high = mid - 1;

            } else {

                low = mid + 1;
            }
        }

        return ans;
    }

    private boolean canSplit(int[] nums, int maxSum, int k) {

        int subarrays = 1;
        int sum = 0;

        for (int num : nums) {

            if (sum + num <= maxSum) {

                sum += num;

            } else {

                subarrays++;
                sum = num;
            }
        }

        return subarrays <= k;
    }

    private int findMax(int[] nums) {

        int max = nums[0];

        for (int num : nums) {

            max = Math.max(max, num);
        }

        return max;
    }

    private int findSum(int[] nums) {

        int sum = 0;

        for (int num : nums) {

            sum += num;
        }

        return sum;
    }
}