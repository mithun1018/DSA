class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        HashSet<Integer>ar=new HashSet<>();
        int count=0;
        int max=0;
        for(int a:arr){
            ar.add(a);
        }
        
        for(int i=0;i<arr.length;i++){
            if(!ar.contains(arr[i]-1)){
                count=1;
                int num=arr[i];
                while(ar.contains(num+1)){
                    count++;
                    num++;
                }
                max=Math.max(max,count);
            }
            
        }
        return max;
    }
}