class Solution {
    public int missingNumber(int[] nums) {
        int[] arr=new int[nums.length+1];
        for(int i:nums){
            arr[i]=i;
        }
        for(int j=1;j<arr.length;j++){
            if(arr[j]==0){
                return j;
            }
        }
        return 0;
        
    }
}