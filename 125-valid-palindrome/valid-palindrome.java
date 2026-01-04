class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] arr = s.toCharArray();

        String temp = "";
        for(int i = 0 ; i < arr.length; i++){
             if(Character.isDigit(arr[i]) || Character.isLetter(arr[i])){
                temp+=arr[i];
             }
        }
        StringBuilder sb = new StringBuilder(temp);
        sb = sb.reverse();
       if( temp.equals(sb.toString()))  return true;
       return false;
       
    }
}