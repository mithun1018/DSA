class Solution {
        boolean rec(int n,boolean ans){
        if(n==1){
            return ans;
        }
        if(n%4!=0){
            ans=false;
            return ans;
        }
        n=n/4;
        return rec(n,ans);
    }
    public boolean isPowerOfFour(int n) {
           if(n==0){
            return false;
        }

        return rec(n,true);
        
    }
}