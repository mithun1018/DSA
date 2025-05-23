class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> ar=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>=max){
               max=Math.max(arr[i],max);
               ar.add(arr[i]);
            }
        }
        Collections.reverse(ar);
        return ar;
        
        
    }
}
