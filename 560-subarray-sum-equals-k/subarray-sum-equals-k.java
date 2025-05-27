class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int sum=0;
        HashMap<Integer,Integer>hash=new HashMap<>();
        hash.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(hash.containsKey(sum-k)){
                count+=hash.get(sum-k);
            }
            if(hash.containsKey(sum)){
                hash.put(sum,hash.get(sum)+1);
            }
            else{
                hash.put(sum,1);
            }

        }
        return count;
    }
}