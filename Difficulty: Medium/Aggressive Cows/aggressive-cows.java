// User function Template for Java
class Solution {
    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        // code here
        int low=0;
        int high=stalls[stalls.length-1]-stalls[0];
        int mid=0;
        int ans=0;
        while(low<=high){
            mid=(low+high)/2;
            if(can(stalls,mid,k)){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
        
    }
    public static boolean can(int[] arr,int mid,int k){
        int cow=1;
        int last=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-last>=mid){
                cow++;
                last=arr[i];
            }
        }
        if(cow>=k){
            return true;
        }
        return false;
    }
}