class Solution {
    public int maxSubArray(int[] arr) {
        int maxSum = Integer.MIN_VALUE, sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            maxSum = Math.max(maxSum, sum);
            if(sum < 0){
                sum = 0;
            }
        }
        return maxSum;
    }
}