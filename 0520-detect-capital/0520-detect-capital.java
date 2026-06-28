class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        
        if (n == 1) return true;

        boolean firstUpper = Character.isUpperCase(word.charAt(0));
        boolean secondUpper = Character.isUpperCase(word.charAt(1));

        if (!firstUpper && secondUpper) return false;

        for (int i = 2; i < n; i++) {
            if (Character.isUpperCase(word.charAt(i)) != secondUpper) {
                return false;
            }
        }

        return true;
    }
}
