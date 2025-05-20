// User function Template for Java

// a,b : the arrays
class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
         int aLen=a.length;
        int bLen=b.length;
        int i=0;
        int j=0;
        ArrayList<Integer> arr=new ArrayList<>();
        while(i<aLen && j<bLen){
            if(a[i]<b[j]){
                if(arr.size()==0 || arr.get(arr.size()-1)!=a[i]){
                    arr.add(a[i]);
                }
                i++;
            }
            else{
                 if(arr.size()==0 || arr.get(arr.size()-1)!=b[j]){
                    arr.add(b[j]);
                }
                j++;
                
            }
        }
        while(i<aLen){
            if( arr.get(arr.size()-1)!=a[i]){
                arr.add(a[i]);
            }
            i++;
        }
        
        while(j<bLen){
            if( arr.get(arr.size()-1)!=b[j]){
                arr.add(b[j]);
            }
            j++;
        }
        return arr;
        
    }
}
