class Solution {
        boolean rec(int n){
        if(n==1){
            return true;
        }
        if(n%4!=0){
            return false;
        }
        n=n/4;
        return rec(n);
    }
    public boolean isPowerOfFour(int n) {
           if(n==0){
            return false;
        }

        return rec(n);
        
    }
}