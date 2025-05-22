// User function Template for Java

class Solution {
    public ArrayList<Integer> findSubarray(int arr[]) {
        // code here
         int max=Integer.MIN_VALUE;
        int sum=0;
        int st=-1;
        int start=-1;
        int end=-1;
        ArrayList<Integer>ar=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                sum=0;
                continue;
            }
            if(sum==0){
                st=i;
            }
            sum+=arr[i];
            if(sum>=max){
                max=Math.max(max,sum);
                start=st;
                end=i;
            }
            
            if(sum<0){
                sum=0;
            }
        }
        // int[] arr1 = Arrays.copyOfRange(arr,start,end); 
        // ArrayList<Integer> ans = Arrays.asList(arr1);
        if(start==-1 && end==-1){
            return new ArrayList<>(Arrays.asList(-1));
        }
        for(int i=start;i<=end;i++){
            ar.add(arr[i]);
            
        }
        return ar;
        
        
    }
}