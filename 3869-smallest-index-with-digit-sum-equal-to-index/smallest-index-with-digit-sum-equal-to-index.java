class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]>9){
                String s=String.valueOf(nums[i]);
                int sum=0;
                for(int j=0;j<s.length();j++){
                    sum+=s.charAt(j)-'0';
                }
                nums[i]=sum;
            }
            if(nums[i]==i){
                return i;
            }
        }
        return -1;
        
    }
}