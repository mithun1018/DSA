class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       int[] temp=new int[nums.length];
        ArrayList<Integer> arr=new ArrayList<>();
       for(int i:nums){
        temp[i-1]=1;
       }
        for(int i=0;i<temp.length;i++){
            if(temp[i]==0){
                arr.add(i+1);
            }
        }
        return arr;
    }
}