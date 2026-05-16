class Solution {
    public String largestEven(String s) {
        int endDig = 0;
        for(int i = s.length()-1; i >= 0; i--){
            char ch = s.charAt(i);
            int num = ch - '0';
            if(num % 2 == 0){
                endDig = i+1;
                break;
            }
        }
        return s.substring(0,endDig);
    }
}