class Solution {
    public void setZeroes(int[][] matrix) {
        int zeroMat=0;
        ArrayList<Integer> arr1=new ArrayList<>();
        boolean flag=false;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
             for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    flag=true;
                    arr.add(j);
                    arr1.add(i);
                }
             }
        }
        if(flag){
            for(int i=0;i<matrix.length;i++){
             for(int j=0;j<matrix[0].length;j++){
                if(arr1.contains(i)){
                    matrix[i][j]=0;
                }
                if(arr.contains(j)){
                    matrix[i][j]=0;
                }
             }
        }


        }
        

        
    }
}