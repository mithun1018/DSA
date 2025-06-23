class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> arr=new HashMap<>();
        HashMap<Character,Character> arr1=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char t1=s.charAt(i);
            char t2=t.charAt(i);
            if(arr.containsKey(t1)){
                if(arr.get(t1) != t2){
                    return false;
                }
            }
            else if(arr1.containsKey(t2))
            {
                if(arr1.get(t2) != t1){
                    return false;
                }
            }
            else{
                arr1.put(t2,t1);
                arr.put(t1,t2);
            }
        }
        return true;
        
    }
}