class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=arr.length;
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
            
        }
        for(int key:map.keySet()){
            if(map.get(key)>1){
                ar.add(key);
            }
        }
        return ar;
        
    }
}