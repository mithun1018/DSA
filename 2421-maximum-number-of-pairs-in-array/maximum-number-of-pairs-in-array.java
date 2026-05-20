class Solution {
    public int[] numberOfPairs(int[] nums) {
        int pair = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j] && nums[j] >= 0 && nums[i] >= 0){
                    nums[i] = -1;
                    nums[j] = -1;
                    pair++;
                }
            }
        }
        int rem = nums.length - (pair *2);
        return new int[]{pair , rem};
        
    }
}