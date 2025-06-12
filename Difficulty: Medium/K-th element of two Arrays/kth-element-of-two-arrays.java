// User function Template for Java

class Solution {
    public int kthElement(int nums1[], int nums2[], int k) {
        // code here
          int n=nums1.length+nums2.length;
    
        int point=1;
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                
                
                if(point==k){
               return nums1[i];
                }
               
                point++;
                i++;
            }else{
                
                
                if(point==k){
               return nums2[j];
                }
                point++;
                j++;
            }
           
        }
        while(i<nums1.length){
           
                if(point==k){
               return nums1[i];
                }
                 i++;
            point++;

        }
        while(j<nums2.length){
             
                 if(point==k){
               return nums2[j];
                }
                 j++;
                point++;

        }
       return 0;
        
    }
}