class Solution {
    public String kthDistinct(String[] arr, int k) {
        if(arr.length<k){
            return "";
        }
       HashMap<String,Integer> map=new HashMap<>();
       for(String i:arr){
        if(map.containsKey(i)){
            map.put(i,map.get(i)+1);
        }else{
            map.put(i,1);
        }
       }
       int v=0;
       for(String s:arr){
        if(map.get(s)==1){
            v++;
        }
        if(v==k){
            return s;
        }
       }
       return "";
        
    }
}