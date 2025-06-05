class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        
        int low=0;
        int high=arr.length-1;
        int first=-1;
        int mid=0;
        //for First occur index
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==target){
                first=mid;
                high=mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        if(first==-1){
            return 0;
        }

         int i=0;
        int j=arr.length-1;
        int last=-1;
        int mid1=0;
        //for last occur index
        while(i<=j){
            mid1=(i+j)/2;
            if(arr[mid1]==target){
                last=mid1;
                i=mid1+1;
            }
            else if(arr[mid1]<target){
                i=mid1+1;
            }else{
                j=mid1-1;
            }
        }
        return last-first+1;
        
    }
}
