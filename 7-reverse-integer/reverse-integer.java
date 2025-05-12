class Solution {
    public int reverse(int x) {
            boolean minus= true;
  
    if(x<0){
        minus=false;
        x*=-1;
    }
    StringBuilder s=new StringBuilder(String.valueOf(x));
    try{
        int output=Integer.parseInt(s.reverse().toString());
    if(!minus){
         output*=-1;
    }
    return output;
    }
    catch(Exception e){
        return 0;
    }
    

    }
}