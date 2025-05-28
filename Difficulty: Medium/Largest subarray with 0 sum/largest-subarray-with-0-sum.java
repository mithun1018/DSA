class Solution {
    int maxLen(int arr[]) {
        // code here
        int k=0;
        
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k){
                max=Math.max(max,i+1);
            }
            if(map.containsKey(sum-k)){
                max=Math.max(max,i-map.get(sum-k));
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return max;
        
    }
}