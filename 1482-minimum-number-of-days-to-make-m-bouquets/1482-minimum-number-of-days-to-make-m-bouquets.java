class Solution {
    public int minDays(int[] nums, int m, int k) {
        int low = findMin(nums);
        int high = findMax(nums);
        int ans = -1;
        
        if((long)m*k > nums.length){
            return -1;
        }
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(canMake(nums, mid, m, k)){
                ans = mid;
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }

    private boolean canMake(int[] bloomDay, int day, int m, int k) {
        int flowers = 0;
        int bouquets = 0;
        for (int bloom : bloomDay) {
            if (bloom <= day) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0;
            }
        }
        return bouquets >= m;
    }
    
    private int findMin(int[] nums){
        int min = nums[0];
        for(int num : nums){
            min = Math.min(min, num);
        }
        return min;
    }
    
    private int findMax(int[] nums){
        int max = nums[0];
        for(int num : nums){
            max = Math.max(max, num);
        }
        return max;
    }
}