class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = findMax(nums);
        int min = Integer.MAX_VALUE;
        
        while (low <= high){
            int mid = low + (high - low) / 2;
            if(smallDiv(nums, mid, threshold)){
                min = Math.min(min, mid);
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return min;
    }

    private boolean smallDiv(int[] nums, int mid, int m){
        int sum = 0;
        for(int num : nums){
            int div =  (num + mid - 1) / mid;
            sum = sum + div;
        }
        if(sum <= m){
            return true;
        }
        return false;
    }
    
    private int findMax(int[] nums){
        int max = nums[0];
        for(int num : nums){
            max = Math.max(max, num);
        }
        return max;
    }
}