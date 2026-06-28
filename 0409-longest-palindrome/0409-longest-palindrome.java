class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128];
        int length = 0;

        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        for (int count : freq) {
            length += (count / 2) * 2;
            if (length % 2 == 0 && count % 2 == 1) {
                length += 1;
            }
        }

        return length;
    }
}
