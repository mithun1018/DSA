class Solution {
    public String sortSentence(String s) {
         String[] arr=s.split(" ");
         int ind=1;
         String out="";
         while(ind<=arr.length){
            for(int i=0;i<arr.length;i++){
                String temp=arr[i];
                int len=temp.charAt(temp.length()-1)-'0';
              
                if(len==ind){
                   temp=temp.substring(0,temp.length()-1);
                    out+=temp+" ";
                    ind++;
                }
            }

         }
         return out.trim();
        
        
    }
}