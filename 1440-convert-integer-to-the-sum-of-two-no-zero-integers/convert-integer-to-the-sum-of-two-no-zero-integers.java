class Solution {
    public int[] getNoZeroIntegers(int n) {
        int a = n -1;
        int b = 1;
        String sb1 = a+"";
        String sb2 = b+"";
        while(a >= b){
            if(sb1.contains("0") ){
                a--;
                b++;
                sb1 = a+"";
                sb2 = b+""; 

            }
            else if(sb2.contains("0")){
                b++; 
                a--; 
                sb2 = b+""; 
                sb1 = a+"";

                
            }
            else{
                return new int[] {a,b};
            }
        }
        return new int[] {a,b};
        
    }
}