class Solution {
    public int majorityElement(int[] arr) {
        HashMap<Integer, Integer> majority = new HashMap<>();
        for(int num : arr){
            majority.put(num, majority.getOrDefault(num, 0) + 1);
            if(majority.get(num) > arr.length / 2){
                return num;
            }
        }
        return -1;
    }
}