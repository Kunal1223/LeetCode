//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.lps(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int lps(String s) {
        // code here
        int arr[] = new int[s.length()];
        int pre =0 , suf=1;
        while(suf<s.length()){
            char a = s.charAt(pre);
            char b = s.charAt(suf);
            if(a==b){
                arr[suf]=pre+1;
                pre++;
                suf++;
            }
            else{
                if(pre==0){
                    arr[suf++]=0;
                }
                else{
                    pre = arr[pre-1];
                }
            }
        }
        return arr[s.length()-1];
    }
}