class Solution {
    public static int largest(int[] arr) {
        // code here
        int i=0;
        int j=arr.length-1;
        int max=0;
        while(i<=j){
            int temp=Math.max(arr[i],arr[j]);
            max=Math.max(max,temp);
            i++;
            j--;
            
        }
        return max;
    }
}
