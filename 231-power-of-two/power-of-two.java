class Solution {
    boolean rec(int n,boolean ans){
        if(n==1){
            return ans;
        }
        if(n%2!=0){
            ans=false;
            return ans;
        }
        n=n/2;
        return rec(n,ans);
    }
    public boolean isPowerOfTwo(int n) {
        if(n==0){
            return false;
        }

        return rec(n,true);
        
    }
}