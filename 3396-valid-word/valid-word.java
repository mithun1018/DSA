class Solution {
    public boolean isValid(String word) {
        boolean dig=false;
        boolean con=false;
        boolean vo=false;
        int count=0;
        if(word.length()<3){
            return false;
        }
        char[] arr=word.toCharArray();
        ArrayList<Character> vow=new ArrayList<>();
        vow.add('A');
        vow.add('a');
        vow.add('E');
        vow.add('e');
        vow.add('I');
        vow.add('i');
        vow.add('O');
        vow.add('o');
        vow.add('U');
        vow.add('u');
        for(int i=0;i<word.length();i++){
            if(arr[i]=='@' || arr[i]=='#' || arr[i]=='$'){
                return false;
            }
            if(Character.isDigit(arr[i])){
                dig=true;
                count++;
            }
            if(Character.isAlphabetic(arr[i])){
                if(vow.contains(arr[i])){
                    vo=true;
                    count++;
                }else{
                    con=true;
                    count++;
                }
            }
        }
        if(vo && con && count>=3){
            return true;
        }else{
            return false;
        }
        
    }
}