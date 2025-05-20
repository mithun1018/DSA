class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> arr=new ArrayList<>();
        if(nums.length==0){
            return arr;
        }
        if(nums.length==1){
            arr.add(String.valueOf(nums[0]));
            return arr;
        }
        int i=0;
        boolean flag=false;
        boolean stFlag=false;
        String s="";
        while(i<nums.length-1){
            
            if(s.length()==0){
                s+=nums[i];
            }
            int temp=nums[i];
            if(nums[i+1]==temp+1){
                stFlag=true;
                flag=true;
            }
            else{
                if(flag){
                    s+="->"+nums[i];
                }
                arr.add(s);
                s="";
                stFlag=false;
                flag=false;
            }
            i++;
        }
         if(flag){
                    s+="->"+nums[i];
        }
        else{
            s+=nums[i];
        }
        
        arr.add(s);

        return arr;
        
    }
}