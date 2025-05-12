class Solution {
    public boolean isPalindrome(int x) {
        int og=x;
        int out=0;
        boolean val=false;
        if(x<0){
            return false;
        }
        while(og>0){
             int dig=og%10;
             out=out*10+dig;
             og=og/10;
        }
       if(x==out){
        val=true;
       }
       return val;

        
    }
}