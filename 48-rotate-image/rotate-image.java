class Solution {
    public void rotate(int[][] matrix) {
        int[][] arr=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            int k=0;
            for(int j=matrix.length-1;j>=0;j--){
                arr[i][k]=matrix[j][i];
                
                k++;
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=arr[i][j];
            }
        }
        
    }
}