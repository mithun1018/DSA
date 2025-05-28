class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> arr=new ArrayList<>();
        Arrays.sort(nums);
        for(int v:nums){
            System.out.print(v+",");
        }
        for(int i=0;i<nums.length;i++){

             if( i!=0 && nums[i]==nums[i-1]){
                        continue;
            }

            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                    
                }
                else if(sum>0){
                    k--;
                    
                }
                else{
                    ArrayList<Integer>ar=new ArrayList<>();
                    ar.add(nums[i]);
                    ar.add(nums[j]);
                    ar.add(nums[k]);
                    arr.add(ar);
                    while(j<k && nums[k]==nums[k-1]){
                        k--;
                    }
                    while(j<k && nums[j]==nums[j+1]){
                        j++;
                    }
                    j++;
                    k--;
                    
                }
            }
            
        }

        return arr;
    }
}