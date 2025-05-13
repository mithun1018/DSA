class Solution {
        boolean reverse(int i,String s){
         if(i>=s.length()/2){
             return true;
         }
           if(s.charAt(i)!=s.charAt(s.length()-1-i)){
            return false;
           }
             
             return reverse(++i,s);
         
        
    }
    public boolean isPalindrome(String s) {
        String dup=new String();
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))){
                dup+=Character.toLowerCase(s.charAt(i));
            }
        }
        return reverse(0,dup);

        
    }
}