// User function Template for Java

class Solution {
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        // Your Code Here
        return mergeSort(arr,0,arr.length-1);
        
    }
    


    
    static int merge(int arr[],int mid,int l,int h){
        int left=l;
        int right=mid+1;
        ArrayList<Integer> temp=new ArrayList<>();
        int count=0;
        while(left<=mid && right<=h){
            if(arr[left]>arr[right]){
                count+=mid-left+1;
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
        return count;
    }

    static int  mergeSort(int arr[], int l, int h) {
        int count=0;
        // code here
           if(l>=h){
            return count;
        }
        
        int mid=(l+h)/2;
        count+= mergeSort(arr,l,mid);
        count+= mergeSort(arr,mid+1,h);
        count+= merge(arr,mid,l,h);
        return count;
        
    }
}