class Solution {
    public int lengthOfLongestSubstring(String s) {
        String temp="";
        int max=0;
        for(int i=0;i<s.length();i++){
            String ch=s.substring(i,i+1);
            if (temp.contains(ch)) {
                int index = temp.indexOf(ch);
                temp = temp.substring(index + 1);
                max=Math.max(max,temp.length());
            }
            
                temp+=ch;
                max=Math.max(max,temp.length());
            
            // temp+=s.charAt(i);
           
        }
        return max;
        
    }
}