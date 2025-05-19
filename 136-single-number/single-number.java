class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer>hashmap=new HashMap<>();
        for(int i:nums){
            if(hashmap.containsKey(i)){
                hashmap.put(i,hashmap.get(i)+1);
            }else{
                hashmap.put(i,1);
            }
        }
        for(int key:hashmap.keySet()){
            if (hashmap.get(key)==1) {
                return key;
            }
            
        }
        return -1;
        
    }
}