

class Solution {
    
    void merge(int arr[],int mid,int l,int h){
        int left=l;
        int right=mid+1;
        ArrayList<Integer> temp=new ArrayList<>();
        while(left<=mid && right<=h){
            if(arr[left]>arr[right]){
                temp.add(arr[right]);
                right++;
            }
            else{
                temp.add(arr[left]);
                left++;
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
        int temp1=0;
        for(int i=l;i<=h;i++){
            arr[i]=temp.get(temp1);
            temp1++;
        }
        
    }

    void mergeSort(int arr[], int l, int h) {
        // code here
           if(l==h){
            return;
        }
        int mid=(l+h)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,h);
        merge(arr,mid,l,h);
        
    }
}