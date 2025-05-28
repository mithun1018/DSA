class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        for(int k:map.keySet()){
            if(map.get(k)>nums.length/3){
                arr.add(k);
            }
        }

        return arr;
    }
}