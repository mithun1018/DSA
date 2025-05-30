class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            int sum1=s.charAt(i);
            int sum2=s.charAt(i+1);
             sum+=Math.abs(sum1-sum2);
           
        }
        return sum;
        
    }
}