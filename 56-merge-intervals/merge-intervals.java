class Solution {
    public int[][] merge(int[][] intervals) {
        Comparator<int[]> arr=new Comparator<>(){
            public int compare(int a[],int b[]){
                int dif=a[0]-b[0];
                return dif;
            }
        };
        Arrays.sort(intervals,arr);
        int[][] ans=new int[intervals.length][2];
        int index=0;

        for(int i=0;i<intervals.length;i++){
            int start=intervals[i][0];
            int end=intervals[i][1];
            if(index==0 || ans[index-1][1]<start){
                ans[index][0]=start;
                ans[index][1]=end;
                index++;
            }else{
                ans[index-1][1]=Math.max(end,ans[index-1][1]);
            }
        }
       
        return  Arrays.copyOf(ans,index);
        
    }
}