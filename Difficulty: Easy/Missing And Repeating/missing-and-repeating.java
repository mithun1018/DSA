// User function Template for Java

class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
           long n=arr.length;
        long SN=(n*(n+1))/2;
        long S2N=(n*(n+1)*(2*n+1))/6;
        long s=0;
        long s2=0;
        for(int i=0;i<n;i++){
            s+=(long)arr[i];
            s2+=(long)arr[i]*(long)arr[i];
        }
        long val1=s-SN;
        long val2=s2-S2N;
        val2=val2/val1;
        long x=(val1+val2)/2;
        long y=x-val1;
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add((int)x);
        ans.add((int)y);
        return ans;
    }
}
