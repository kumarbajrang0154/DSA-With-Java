class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int total = 0;
        for(int i =0; i < n; i++){
            int[] freq = new int[26];
            
            for(int j = i; j < n; j++){
                int min = Integer.MAX_VALUE;
                int max = 0;
                freq[s.charAt(j) - 'a']++;
                
                for(int k = 0; k < freq.length; k++){
                if(freq[k] > 0){
                    min = Math.min(min, freq[k]);
                    max = Math.max(max, freq[k]);
                }
            }
            total += (max - min);
            }
        }
        return total;
    }
}