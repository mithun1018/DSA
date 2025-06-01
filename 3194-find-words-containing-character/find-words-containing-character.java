class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
      
        ArrayList<Integer> out=new ArrayList<>();
        String val=String.valueOf(x);
        for(int i=0;i<words.length;i++){
            String temp=words[i];
            for(int j=0;j<temp.length();j++){
                if(temp.contains(val)){
                    out.add(i);
                    break;
                }
            }
         
        }
        return out;
        
    }
}