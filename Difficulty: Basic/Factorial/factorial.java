//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.factorial(N));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
      static int count(int i,int n,int count){
        if(i==n){
            // System.out.print(count);
            return count;
        }
        i++;
        count*=i;
        return count(i,n,count);
        
        
    }
    static int factorial(int n) {
        // code here
         return count(0,n,1);
        
    }
}