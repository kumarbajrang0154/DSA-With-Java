class Solution {
    public int shipWithinDays(int[] weights, int days){
        int low = 0;
        int high = 0;
        
        for(int num : weights){
            low = Math.max(low, num);
            high = high + num;
        }
        
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(canShip(weights,days,mid)){
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
    
    private boolean canShip(int[] weights, int days, int mid){
        int dayUsed = 1;
        int currentLoad = 0;
        
        for(int weight : weights){
            if(currentLoad + weight > mid){
                dayUsed++;
                currentLoad = weight;
            }else{
                currentLoad = currentLoad + weight;
            }
        }
        return dayUsed <= days;
    }
}