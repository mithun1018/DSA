class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> out=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                continue;
                }
                int k=j+1;
                int l=nums.length-1;
                while(k<l){
                    long sum=nums[i];
                    sum+=nums[j];
                    sum+=nums[k];
                    sum+=nums[l];
                    if(sum<target){
                        k++;
                    }else if(sum>target){
                        l--;
                    }else{
                        ArrayList<Integer> arr=new ArrayList<>();
                        arr.add(nums[i]);
                        arr.add(nums[j]);
                        arr.add(nums[k]);
                        arr.add(nums[l]);
                        out.add(arr);
                        k++;
                        l--;
                        while(k<l && nums[l]==nums[l+1]){
                            l--;
                        }
                        while(k<l && nums[k]==nums[k-1]){
                            k++;
                        }
                        

                    }

                }


            }
        }
        return out;
        
    }
}