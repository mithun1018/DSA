//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			
            Solution ob = new Solution();
            ob.printTillN(N);
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    
   static void print(int i,int n){
         if(i==n){
           return;
        }
        i++;
         System.out.print(i+" ");
            print(i,n);
        
    }
    static void printTillN(int N) {
        print(0,N);
        // code here
       
        
        
    }
}