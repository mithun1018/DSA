//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            int res = obj.seriesSum(n);

            System.out.println(res);

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
        count+=i;
        return count(i,n,count);
        
        
    }
    public static int seriesSum(int n) {
        // code here
        return count(0,n,0);
        
    }
}
