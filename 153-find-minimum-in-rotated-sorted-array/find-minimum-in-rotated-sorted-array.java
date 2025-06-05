class Solution {
    public int findMin(int[] nums) {
         int low=0;
        int high=nums.length-1;
        int mid=0;
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            mid=(low+high)/2;
            if(nums[low]<=nums[mid]){
                if(nums[low]<ans){
                    ans=nums[low];
                }
                
                low=mid+1;
            }else{
                if(nums[mid]<ans){
                    ans=nums[mid];
                }
                high=mid-1;
            }
        }
        return ans;
    }
}