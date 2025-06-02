class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }

     int mergeSort(int arr[], int l, int h) {
        // code here
        int count=0;
           if(l==h){
            return count;
        }
        
        int mid=(l+h)/2;
        count+=mergeSort(arr,l,mid);
        count+=mergeSort(arr,mid+1,h);
        count+=countPairs(arr,l,mid,h);
        merge(arr,mid,l,h);
        return count;
        
    }

    int countPairs(int arr[],int low,int mid,int high){
        int right=mid+1;
        int count=0;
        for(int left=low;left<=mid;left++){
            while(right<=high && arr[left]>(long)2*(long)arr[right]){
                right++;
            }
             count+=(right-(mid+1));
        }
        return count;
    }

      void merge(int arr[],int mid,int l,int h){
        int left=l;
        int right=mid+1;
        ArrayList<Integer> temp=new ArrayList<>();
        while(left<=mid && right<=h){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
         while(right<=h){
            temp.add(arr[right]);
            right++;
        }
        for(int i=l;i<=h;i++){
            arr[i]=temp.get(i - l);
        }
        
    }

   
}