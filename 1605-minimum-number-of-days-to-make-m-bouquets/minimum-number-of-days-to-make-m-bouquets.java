class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        int mid=0;
        int ans=-1;
        if(bloomDay.length<m*k){
            return -1;
        }
        for(int i:bloomDay){
            low=Math.min(low,i);
            high=Math.max(high,i);
        }
        while(low<=high){
            mid=(low+high)/2;
            if(poss(bloomDay,mid,m,k)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
        
    }
    static boolean poss(int[]arr, int mid, int m, int k){
        int boc=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=mid){
                count++;
            }else{
                boc+=count/k;
                count=0;
            }
        }
         boc+=count/k;
         if(boc>=m){
            return true;
         }
         return false;
    }
}