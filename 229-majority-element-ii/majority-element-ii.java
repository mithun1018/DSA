class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int ele1=nums[0];
        int count1=0;
        int ele2=nums[0];
        int count2=0;
        int n=nums.length;
        List<Integer>arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(count1==0 && nums[i]!=ele2){
                ele1=nums[i];
                count1++;
            }
            else if(count2==0 && nums[i]!=ele1)
            {
                ele2 = nums[i];
                count2++;
            }
            else if(nums[i]==ele1){
                count1++;
            }
            else if(nums[i]==ele2){
                count2++;
            }
            else
            {
                count1--;
                count2--;
            }
        }

        int ans1=0;
        int ans2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==ele1){
                ans1++;
            }
            else if(nums[i]==ele2){
                ans2++;
            }

        }
        if(ans1>n/3){
            arr.add(ele1);
        }
        if(ans2>n/3){
            arr.add(ele2);
        }
     
        
       
        return arr;
 
        
        
    }
}

    