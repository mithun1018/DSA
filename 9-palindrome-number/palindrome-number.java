class Solution {
    public boolean isPalindrome(int x) {
        String s =x+"";
        StringBuilder sb = new StringBuilder(s);
        
        sb.reverse();
        if(sb.toString().equals(s)) return true;
        return false;
    }
    
}