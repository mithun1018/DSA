class Solution {

    static int findFloor(int[] arr, int x) {
        // write code here
        int i=0;
        int j=arr.length-1;
        int ans=-1;
        int mid=0;
        while(i<=j){
            mid=(i+j)/2;
            if(arr[mid]<=x){
                ans=mid;
                i=mid+1;
            }else{
                
                j=mid-1;
            }
        }
        return ans;
    }
}
