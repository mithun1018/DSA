class Solution {
    public int percentageLetter(String s, char letter) {
        // String ch=letter+"";
        // if(!(s.contains(ch))){
        //     return 0;
        // }
        int count=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)==letter){
                count++;
            }
        }
        double ans=(double)(count/(double)n)*100;
        return (int)ans;
        
    }
}