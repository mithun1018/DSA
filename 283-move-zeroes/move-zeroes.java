class Solution {
    public void moveZeroes(int[] nums) {
        int zeroIndex=0;
        for(int j=0;j<nums.length-1;j++){
            if(nums[j]==0){
                zeroIndex=j;
                break;
            }
        }
        for(int i=zeroIndex+1;i<nums.length;i++){
            if(nums[zeroIndex]==0 && nums[i]!=0){
                int temp=nums[zeroIndex];
                nums[zeroIndex]=nums[i];
                nums[i]=temp;
                zeroIndex++;
                // i++;
            }
        }
        
    }
}