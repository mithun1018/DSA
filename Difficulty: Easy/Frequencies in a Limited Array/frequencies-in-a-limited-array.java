class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        // code here
        ArrayList<Integer> ar=new ArrayList<>();
        int[] temp=new int[arr.length];
        
        for(int i:arr){
            temp[i-1]=temp[i-1]+1;
        }
        for(int i:temp){
            ar.add(i);
        }
        return ar;
        
    }
}
