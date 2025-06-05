class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int first=-1;
        int mid=0;
        //for First occur index
        while(low<=high){
            mid=(low+high)/2;
            if(nums[mid]==target){
                first=mid;
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }

         int i=0;
        int j=nums.length-1;
        int last=-1;
        int mid1=0;
        //for last occur index
        while(i<=j){
            mid1=(i+j)/2;
            if(nums[mid1]==target){
                last=mid1;
                i=mid1+1;
            }
            else if(nums[mid1]<target){
                i=mid1+1;
            }else{
                j=mid1-1;
            }
        }
        return new int[]{first,last};
    }

}