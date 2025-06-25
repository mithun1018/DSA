class Solution {
    public String frequencySort(String s) {
        String out="";
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        } 
        ArrayList<Character> arr=new ArrayList<>(map.keySet());
        arr.sort((obj1,obj2)-> map.get(obj2) - map.get(obj1));
        for(char c:arr){
            for(int i=0;i<map.get(c);i++){
                out+=c;
            }
        }
        return out;
    }
}