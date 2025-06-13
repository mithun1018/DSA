class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(low<=high){
            mid=(low+high)/2;
            int miss=arr[mid]-(mid+1);
            if(miss>=k){
                high=mid-1;
            }else{
                low=mid+1;
                
            }
        }
        return k+high+1;
    }
}