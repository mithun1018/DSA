class Solution {
    public void rot(int start,int end,int[] nums){
        // int i=start;
        int j=end;

         for(int i=start;i<end;i++){
            if(i<=j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            j--;
            }
        }

    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        
       
        k = k%n;
        rot(0,n-k-1,nums);
        rot(n-k,n-1,nums);
        rot(0,n-1,nums);

    }

}