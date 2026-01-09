class Solution {
    public int strStr(String haystack, String needle) {
        if(!(haystack.contains(needle))){
            return -1;
        }
        for(int i = 0 ; i < haystack.length() ; i++){
            if(haystack.charAt(i) == needle.charAt(0) && i+needle.length() <= haystack.length()){
                String temp = haystack.substring(i,i+needle.length());
                if(temp.equals(needle)){
                    return i;
                }
            }
        }
        return 0;
    }
}