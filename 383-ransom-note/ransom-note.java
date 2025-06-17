class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<magazine.length();i++){
            if(map.containsKey(magazine.charAt(i))){
                map.put(magazine.charAt(i),map.get(magazine.charAt(i))+1);
            }else{
                map.put(magazine.charAt(i),1);
            }
        }
        for(int i=0;i<ransomNote.length();i++){
            if(!(map.containsKey(ransomNote.charAt(i)))){
                return false;
            }else{
                int temp=map.get(ransomNote.charAt(i));
                if(temp==0){
                    map.remove(ransomNote.charAt(i));
                }else{
                    map.put(ransomNote.charAt(i),temp-1);
                    count++;
                }
            }
        }
        if(count==ransomNote.length()){
            return true;
        }
        
        return false;
    }
}