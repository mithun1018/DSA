class Solution {
    public boolean rotateString(String s, String goal) {
        
        if(s.length()!=goal.length()){
            return false;
        }
        String out=s+s;
        return out.contains(goal);
    }
}