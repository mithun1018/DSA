class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int sum=arr[i]+arr[j];
                if(sum == target) return true;
            }
        }
        return false;
    }
}