class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
      
        ArrayList<Integer> out=new ArrayList<>();
        ArrayList<String> arr=new ArrayList<>(List.of(words));
        for(int i=0;i<arr.size();i++){
            String a=String.valueOf(x);
            if(arr.get(i).contains(a)){
                out.add(i);
            }
        }
        return out;
        
    }
}