// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int count=0;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            int temp=arr[i].length-lower(arr[i],1);
            if(temp>count){
                count=temp;
                index=i;
            }
        }
        return index;
        
    }
    static int lower(int[] arr,int x){
        int low=0;
        int high=arr.length-1;
        int mid=0;
        int ans=arr.length;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]>=x){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
            
        }
        
        return ans;
    }
}