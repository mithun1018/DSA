class Solution {
    public int smallestNumber(int x, int t) {
       
       
       

        while(true){
           int n=x++;
            int sum = 1;
            sum = 1;
            while(n > 0){
                int dig = n % 10;
                sum *= dig;
                n = n / 10;
            }
            if(sum % t == 0) return --x;
        }
      

        
    }
}