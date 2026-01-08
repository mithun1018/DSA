class Solution {
    public String longestCommonPrefix(String[] strs) {
        int sLen = Integer.MAX_VALUE;
        String temp = "";
       String out = "";
        for(String s: strs){
            sLen = Math.min(sLen,s.length());
            if(s.length() == sLen){
                temp = s;
            }
        }
        for(int i = 0 ; i < sLen ; i++){
            boolean flag = true ;
           for(int j = 0 ; j < strs.length ; j++){
            if(strs[j].charAt(i) != temp.charAt(i)){
               flag = false;
               return out;
            }
           }
           if(flag){
            out +=  temp.charAt(i)+"";
           }
        }
       
        return out;
    }
}