//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String arr[] = in.readLine().trim().split("\\s+");
            int A = Integer.parseInt(arr[0]);
            int B = Integer.parseInt(arr[1]);
            int C = Integer.parseInt(arr[2]);
            
            Solution ob = new Solution();
            out.println(ob.inSequence(A, B, C));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int inSequence(int A, int B, int C) {
       
        if (A == B) {
            return 1;
        }
        
        
        if (A != B && C == 0) {
            return 0; 
        }

        
        int n = Math.abs(B - A) / Math.abs(C);
        n = n + 1;


        if ((A + (n - 1) * C) == B) {
            return 1; 
        }
        
        return 0; 
    }
}