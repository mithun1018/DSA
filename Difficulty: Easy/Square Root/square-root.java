/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution {
    int floorSqrt(int n) {
        // Your code here
        int low=0;
        int high=n;
        int mid=0;
        int ans=1;
        while(low<=high){
            mid=(low+high)/2;
            if(mid*mid <= n){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
        
    }
}