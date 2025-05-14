class Solution {
     boolean rec(int n){
         if(n<=0){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n%3!=0){
            return false;
        }

        if(n/3==1){
            return true;
        }
        n=n/3;
        return rec(n);
    }
    
    public boolean isPowerOfThree(int n) {
        return rec(n);
    }
}