class Solution {
    public List<String> summaryRanges(int[] nums) {

        ArrayList<String> result = new ArrayList<>();
         if(nums.length<1){
                return result;
            }
        String temp = "";
        boolean flag = true;
        boolean flagnew = true;
        for(int i=0;i<nums.length-1;i++){
           
            
            if(nums[i] != nums[i+1]-1){
                if(i==0){
                    temp+=nums[i];
                }
                else{
                     temp+=nums[i];
                }
               
                result.add(temp);
                temp="";
                flag = true;
                flagnew = true;
                continue;
            }
           


            if(flagnew){
                temp+=nums[i];
                flagnew=false;
            }

            
            
            

            if(flag && temp.length()>=1){
                flag = false;
                temp+="->";
            }

        }
        temp+=nums[nums.length-1];
        result.add(temp);
        return result;
    }
}