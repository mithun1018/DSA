class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int [] arr=new int[mat.length];
        for(int i=0;i<mat.length;i++){
            int temp=0;
            for(int j=0;j<mat[0].length;j++){
                temp+=mat[i][j];
            }
            arr[i]=temp;
        }
        int[] out=new int[k];
        for(int i=0;i<k;i++){
            int ind=-1;
            int min=Integer.MAX_VALUE;
            for(int j=0;j<arr.length;j++){
                if(arr[j]<min){
                    min=arr[j];
                    ind=j;

                }
            }
            out[i]=ind;
            arr[ind]=Integer.MAX_VALUE;
        }
       
        return out;
    }
}