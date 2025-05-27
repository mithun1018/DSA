class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>arr=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            arr.add(fun(i));
        }
        return arr;
        
    }
    public static ArrayList<Integer> fun(int i){
        ArrayList<Integer> ar=new ArrayList<>();
        int sum=1;
        ar.add(sum);
        for(int j=1;j<i;j++){
            sum=sum*(i-j);
            sum=sum/j;
            ar.add(sum);
        }
        return ar;
    }
}