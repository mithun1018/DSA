class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        char[] arr=s.toCharArray();
        String vov="aeiouAEIOU";
        boolean flag1=false;
        boolean flag2=false;
        while(i<=j){
            if(!(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u' || arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U')){
                i++;
            }
            else{
                flag1=true;
            }
            if(!(arr[j]=='a' || arr[j]=='e' || arr[j]=='i' || arr[j]=='o' || arr[j]=='u' || arr[j]=='A' || arr[j]=='E' || arr[j]=='I' || arr[j]=='O' || arr[j]=='U')){
                j--;
            }else{
                flag2=true;
            }
            if(flag1 && flag2){
                System.out.print("yes ");
                char ch=arr[i];
                arr[i]=arr[j];
                arr[j]=ch;
                i++;
                j--;
                flag1=false;
                flag2=false;
            }
        }
        String out="";
        for(char c:arr){
            out+=c;
        }
        return out;
        
    }
}