class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(arr);
        Arrays.sort(target);
        int j=0;
        for(int i:target){
            if(arr[j]!=i){
                return false;
            }
            j++;
        }
        return true;
        
    }
}