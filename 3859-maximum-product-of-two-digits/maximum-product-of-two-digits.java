class Solution {
    public int maxProduct(int n) {
        String s=String.valueOf(n);
        int max=Integer.MIN_VALUE;
        int[] arr=new int[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]=s.charAt(i)-'0';
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum=arr[i]*arr[j];
                max=Math.max(max,sum);

            }
        }
        return max;
        
    }
}