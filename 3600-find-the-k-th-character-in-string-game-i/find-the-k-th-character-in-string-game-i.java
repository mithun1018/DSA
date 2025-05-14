class Solution {
    char rec(int k,String s ){
        if(s.length()>=k){
            return s.charAt(k-1);
        }
        String newString="";
        for(int i=0;i<s.length();i++){
            char temp1=s.charAt(i);
            ++temp1;
            newString+=temp1;
        }
        s+=newString;
        return rec(k,s);
    }
    public char kthCharacter(int k) {
        return rec(k,"a");
    }
}