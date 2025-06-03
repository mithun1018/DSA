// User function Template for Java
class Solution {
    public int findCeil(int[] arr, int x) {
        // code here
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        int mid=0;
        while(low<=high){
             mid=(low+high)/2;
           
            if(arr[mid]<x){
                
                low=mid+1;
                
            }
            else{
               ans=mid;
                high=mid-1;
            }
        }
        return ans;
    }
}
