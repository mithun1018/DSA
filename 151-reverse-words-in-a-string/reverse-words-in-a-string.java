class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split("\\s+");
        String out="";
        for(int i=arr.length-1;i>=0;i--){
            out+=arr[i]+" ";
        }
        
        return out.trim();
        
    }
}