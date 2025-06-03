class Solution {
    public int search(int[] nums, int target) {
        return rec(nums,target,0,nums.length-1);
        
    }
    public static int rec(int[] nums,int target,int low,int high){
        if(low>high){
            return -1;
        }
        int mid=(low+high)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]<target){
            return rec(nums,target,mid+1,high);
        }
         else if(nums[mid]>target){
            return rec(nums,target,low,mid-1);
        }
        return -1;
    }
}