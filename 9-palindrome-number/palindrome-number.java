class Solution {
    public boolean isPalindrome(int x) {
        int ans = 0;
        int og = x;
        if(x < 0) return false;
        while(x > 0){
            ans *= 10;
            int temp = x % 10;
            ans += temp;
            x /= 10;
        }
        if(ans == og) return true;
        return false;
    }
}