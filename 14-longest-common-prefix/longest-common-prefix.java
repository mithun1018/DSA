class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min=Integer.MAX_VALUE;
        int id=0;
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<min){
                min=strs[i].length();
                id=i;
            }
          
        }
        char[] arr=strs[id].toCharArray();
        String out="";
        boolean flag=false;
        boolean flag1=true;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<strs.length;j++){
                if(arr[i]!=strs[j].charAt(i)){
                  flag1=false;
                }   
            }
            System.out.print(flag1);
            if(flag1){
                out+=arr[i];
            }
        }
       
        return out;
        
    }
}