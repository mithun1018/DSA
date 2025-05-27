class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length()){
            return -1;
        }
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)&& haystack.length()-i>=needle.length()){
                boolean flag=true;
                for(int j=0;j<needle.length();j++){
                    if(haystack.charAt(i+j)!=needle.charAt(j)){
                        flag=false;
                    }
                }
                if(flag){
                    return i;
                }
            }
        }
        return -1;

        
    }
}