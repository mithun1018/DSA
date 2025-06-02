class Solution {
    public int[][] generateMatrix(int n) {

        int top=0;
        int left=0;
        int right=n-1;
        int bot=n-1;
        int val=1;
        int[][]out=new int[n][n];
        ArrayList<Integer> arr=new ArrayList<>();

        while( top<=bot && left<=right){

            for(int i=left;i<=right;i++){
                out[top][i]=val;
                val++;
            }
            top++;

            for(int j=top;j<=bot;j++){
                out[j][right]=val;
                val++;
            }
            right--;
            if(top<=bot && left<=right){
                 for(int k=right;k>=left;k--){
               out[bot][k]=val;
               val++;
            }
            bot--;

            }
           
           if(top<=bot && left<=right){
            for(int l=bot;l>=top;l--){
                out[l][left]=val;
                val++;
            }
            left++;
           }
        }
        return out;
        
    }
}