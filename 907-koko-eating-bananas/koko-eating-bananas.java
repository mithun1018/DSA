class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int low=0;
        int high=0;
        for(int i:piles){
            high=Math.max(high,i);
        }
        int ans=Integer.MAX_VALUE;
        int mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(mul(piles,mid)<=h){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
        
    }
    static int mul(int[] nums,int hr){
        int tot=0;
        for(int i=0;i<nums.length;i++){
            tot+=Math.ceil((double)nums[i]/(double)hr);
        }
        return tot;
    }
}