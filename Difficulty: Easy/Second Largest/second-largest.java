class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max1=0;
        int max2=0;
        for(int i:arr){
            max1=Math.max(max1,i);
        }
        for(int i:arr){
            if(i>max2 && i<max1){
                max2=i;
            }
        }
        if(max2==0) return -1;
        else return max2;
        
    }
}