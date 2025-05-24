class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        boolean flag=false;
        if(n==1){
            if(digits[0]==9){
                return new int[]{1,0};
            }else{
                return new int[]{digits[0]+1};
            }
        }
        for(int i=n-1;i>=0;i--){
            // digits[i]+=1;
             if(i==0 && digits[0]==9){

                flag=true;
            }

            if(digits[i]==9){
                digits[i]=0;
                continue;
            }
            else{
                digits[i]+=1;
                break;
            }
           
        }
        if(flag){
            int[] arr=new int[digits.length+1];
            arr[0]=1;
            int i=1;
            for(int k:digits){
                arr[i]=k;
                i++;
            }
            return arr;
        }else{
            return digits;
        }
        
    }
}