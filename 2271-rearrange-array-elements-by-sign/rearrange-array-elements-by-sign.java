class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos=0;
        int neg=0;
        int n=nums.length;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]<0){
        //         neg++;
        //     }else{
        //         pos++;
        //     }
        // }
        int[]posArr=new int[n/2];
        int[]negArr=new int[n/2];
        int pI=0;
        int nI=0;
        for(int i=0;i<nums.length;i++){
             if(nums[i]>0){
                posArr[pI]=nums[i];
                pI++;
            }else{
                negArr[nI]=nums[i];
                nI++;
            }

        }
        int l=0;
        int p=0;
        while(l<n){
            nums[l]=posArr[p];
            nums[l+1]=negArr[p];
            p++;
            l+=2;

        }
        return nums;
        
    }
}