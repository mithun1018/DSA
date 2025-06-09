class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        int out=Integer.MAX_VALUE;
        boolean flag=false;
        for(int i:nums){
            if(i%2==0){
                flag=true;
                if(map.containsKey(i)){
                    map.put(i,map.get(i)+1);
                }else{
                    map.put(i,1);
                }
            }
        }
        for(int key:map.keySet()){
            if(map.get(key)==max){
                out=Math.min(out,key);
            }
            if(map.get(key)>max){
                max=map.get(key);
                out=key;
            }
        }
        if(!flag){
            return -1;
        }
        return out;
        
    }
}