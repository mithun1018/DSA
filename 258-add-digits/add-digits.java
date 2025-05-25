class Solution {
    public int addDigits(int num) {
         String ans="";

        while(ans.length()!=1){
             String s=String.valueOf(num);
        if(s.length()==1){
            return num;
        }
        int val=0;
        for(int i=0;i<s.length();i++){
            val+=Character.getNumericValue(s.charAt(i));
            System.out.println(val);
        }
         ans=String.valueOf(val);
        num=val;
        // return num;

        }
       return num;
        
    }
}