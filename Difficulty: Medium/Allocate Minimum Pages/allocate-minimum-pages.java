
//Back-end complete function Template for Java

class Solution {
    public static int findPages(int[] arr, int k) {
        // code here
        int low=0;
        int high=0;
        int mid=0;
        int ans=0;
        if(arr.length<k){
            return -1;
        }
        for(int i:arr){
            low=Math.max(low,i);
            high+=i;
        }
        while(low<=high){
            mid=(low+high)/2;
            if(can(arr,mid)>k){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
        
    }
       public static int can(int[] arr,int mid){
        int std=1;
        int page=0;
        for(int i=0;i<arr.length;i++){
            if(page+arr[i]<=mid){
                page+=arr[i];
            }else{
                std++;
                page=arr[i];
            }
        }
        return std;
       
    }
}