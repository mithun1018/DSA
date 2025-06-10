class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=0;
        int mid=0;
        int ans=-1;
        for(int i:nums){
            high=Math.max(high,i);
        }
        while(low<=high){
            mid=(low+high)/2;
            if(div(nums,mid)<=threshold){
                ans=mid;
                high=mid-1;
                
            }else{
                low=mid+1;
            }
        }
        return ans;
        

        
    }
    static int div(int[] nums,int mid){
        int sum=0;
        for(int i:nums){
            sum+=Math.ceil((double)i/(double)mid);
        }
        return sum;
    }
}