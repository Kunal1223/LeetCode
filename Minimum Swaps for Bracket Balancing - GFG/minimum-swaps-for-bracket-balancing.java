//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {   
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.minimumNumberOfSwaps(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static int minimumNumberOfSwaps(String S){
        // code here
        int s=0,l=0,k=0,bal=0;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='['){  
                k++;
                if(bal>0){
                    s=s+bal;
                }
                bal=l-k;
            }
            else{
                l++;
                bal=l-k;
            }
        }
        return s;
    }
}