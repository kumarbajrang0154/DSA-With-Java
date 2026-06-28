class Solution {
    public int[] rearrangeArray(int[] arr) {
        int[] ans = new int[arr.length];
        int posindex = 0;
        int negindex = 1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 0){
                ans[posindex] = arr[i];
                posindex += 2;
            }else{
                ans[negindex] = arr[i];
                negindex += 2;
            }
        }
        return ans;
    }
}