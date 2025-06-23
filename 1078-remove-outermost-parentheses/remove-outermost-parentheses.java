class Solution {
    public String removeOuterParentheses(String s) {
        String out="";
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++){
            String temp=s.substring(i,i+1);
            if(temp.equals(")")){
                count--;
            }
            if(count!=0){
                out+=temp;
            }
            if(temp.equals("(")){
                count++;
            }
        }
        return out;
        
    }
}