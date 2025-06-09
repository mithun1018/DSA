class Solution {
    public int reverseDegree(String s) {
        char[] arr=s.toCharArray();
        int i=1;
        int tot=0;
        for(char c:arr){
             
            int temp=('z'-c)+1;
            for(int j=0;j<i;j++){
                tot+=temp;
            }
            i++;
        }
        return tot;

    }
}