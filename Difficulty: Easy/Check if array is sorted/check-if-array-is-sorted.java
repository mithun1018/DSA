//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends

// User function Template for Java

class Solution {
    public boolean arraySortedOrNot(int[] arr) {
        // code here
         for(int i=0;i<arr.length-1;i++){
            int j=i+1;
            if(arr[i]>arr[j]){
                return false;
            }
        }
        return true;
    }
}


//{ Driver Code Starts.

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        while (t-- > 0) {
            String line = scanner.nextLine();
            String[] numStrings = line.split(" ");
            int arr[] = new int[numStrings.length];
            for (int i = 0; i < arr.length; i++)
                arr[i] = Integer.parseInt(numStrings[i]);
            Solution ob = new Solution();
            boolean ans = ob.arraySortedOrNot(arr);
            System.out.println(ans ? "true" : "false");
            System.out.println("~");
        }
        scanner.close();
    }
}
// } Driver Code Ends