class Solution {
    public String tictactoe(int[][] moves) {
        char[][] arr=new char[3][3];
        int val=0;
        for(int[] temp:moves){
            if(val%2==0){
                arr[temp[0]][temp[1]]='x';
                val++;
            }else{
                arr[temp[0]][temp[1]]='o';
                val++;
            }
        }
        for(int i=0;i<3;i++){
            if(arr[i][0]=='x' && arr[i][1]=='x' && arr[i][2]=='x'){
            return "A";
            }
            if(arr[0][i]=='x' && arr[1][i]=='x' && arr[2][i]=='x'){
            return "A";
            }

            if(arr[i][0]=='o' && arr[i][1]=='o' && arr[i][2]=='o'){
            return "B";
            }
            if(arr[0][i]=='o' && arr[1][i]=='o' && arr[2][i]=='o'){
            return "B";
            }
        }

        if(arr[0][0]=='x' && arr[1][1]=='x' && arr[2][2]=='x'){
            return "A";
            }

        if(arr[0][0]=='o' && arr[1][1]=='o' && arr[2][2]=='o'){
            return "B";
            }


         if(arr[0][2]=='x' && arr[1][1]=='x' && arr[2][0]=='x'){
            return "A";
            }

            if(arr[0][2]=='o' && arr[1][1]=='o' && arr[2][0]=='o'){
            return "B";
            }

        if(moves.length==9){
            return "Draw";
        }
        return "Pending";

        
       
    }
}