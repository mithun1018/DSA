class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
        int ele1=n/2;
        int ele2=ele1-1;
        int val1=0;
        int val2=0;
        int point=0;
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                
                
                if(point==ele1){
                val1=nums1[i];
                }
                if(point==ele2){
                val2=nums1[i];
                }
                point++;
                i++;
            }else{
                
                
                if(point==ele1){
                val1=nums2[j];
                }
                if(point==ele2){
                val2=nums2[j];
                }
                point++;
                j++;
            }
           
        }
        while(i<nums1.length){
           
                if(point==ele1){
                val1=nums1[i];
                }
                if(point==ele2){
                val2=nums1[i];
                }
                 i++;
            point++;

        }
        while(j<nums2.length){
             
                if(point==ele1){
                val1=nums2[j];
                }
                if(point==ele2){
                val2=nums2[j];
                }
                 j++;
                point++;

        }
        if(n%2==0){
            return (double)(val1+val2)/2;
        }
        return (double) val1;

        
    }
}