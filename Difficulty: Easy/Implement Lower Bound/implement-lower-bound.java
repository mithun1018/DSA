class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        if(arr[arr.length-1]<target){
            return arr.length;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=target){
                return i;
            }
            
        }
        return -1;
    }
}
