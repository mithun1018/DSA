class Solution {
    public void reverseString(char[] s) {
        char[] arr=new char[s.length];
        int j=0;
        for(int i=s.length-1;i>=0;i--){
            arr[j]=s[i];
            j++;
        }
        int k=0;
        for(char c:arr){
            s[k]=c;
            k++;
        }
    }
}