class Solution {
    public int romanToInt(String s) {
        int total = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int val = value(s.charAt(i));
            
            if (i < s.length() - 1 && val < value(s.charAt(i + 1))) {
                total -= val;
            } else {
                total += val;
            }
        }
        
        return total;
    }

    private int value(char c) {
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        return 1000;
    }
}
