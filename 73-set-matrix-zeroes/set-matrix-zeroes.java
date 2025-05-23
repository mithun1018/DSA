class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> arri=new ArrayList<>();
        ArrayList<Integer> arrj=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
             for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                   
                    arrj.add(j);
                    arri.add(i);
                }
             }
        }
            for(int i=0;i<matrix.length;i++){
             for(int j=0;j<matrix[0].length;j++){
                if(arri.contains(i)){
                    matrix[i][j]=0;
                }
                if(arrj.contains(j)){
                    matrix[i][j]=0;
                }
             }
        }


        
        

        
    }
}