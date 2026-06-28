class Solution {
    public boolean isPalindrome(String s) {
        return check(s.toLowerCase(),0,s.length()-1);
    }
    boolean check(String s,int l,int r){
        while(l<r&&!Character.isLetterOrDigit(s.charAt(l)))l++;
        while(l<r&&!Character.isLetterOrDigit(s.charAt(r)))r--;
        if(l>=r)return true;
        if(s.charAt(l)!=s.charAt(r))return false;
        return check(s,l+1,r-1);
    }       
}