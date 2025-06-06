// User function Template for Java

class Solution {
    public int nthRoot(int n, int m) {
        // code here
        int low=0;
        int high =m;
        int mid=0;
        int ans=-1;
        while(low<=high){
            mid=(low+high)/2;
            if(mul(mid,n)==m){
                ans = mid;
            }
            if(mul(mid,n)<m){
                low=mid+1;
            }else{
                high=mid-1;
            }
            
        }
        return ans;
        
    }
    public static int mul(int mid,int n){
        int ans=1;
        for(int i=0;i<n;i++){
            ans*=mid;
            
        }
        return ans;
    } 
}