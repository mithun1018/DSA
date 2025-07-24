class Solution {
    boolean isPalindrome(String s) {
        // code here
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        String temp = sb.toString();
        if(temp.contains(s)) return true;
        return false;
    }
}