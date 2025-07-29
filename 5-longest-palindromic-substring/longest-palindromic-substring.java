class Solution {
    public String longestPalindrome(String s) {
        ArrayList<String> arr=new ArrayList<>();
        if(s.length()  == 1 || s.length()  == 0){
            return s;
        }
        String out="";
        int count = 0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(j) == c){
                    String temp = s.substring(i,j+1);
                    StringBuilder sb = new StringBuilder(temp);
                    sb.reverse();
                    if((sb.toString()).equals(temp)){
                        if(temp.length() > count){
                            count = temp.length();
                            out = temp ;
                        }
                    }

                   
                }
            }
        }
        
        if(out.length() == 0) return s.substring(0,1);
        return out;
    }
}