//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution ob = new Solution();
            
            System.out.println(ob.minFlips(S));
                        
        }
	}
}


// } Driver Code Ends


//User function Template for Java
class Solution {
    public int minFlips(String S) {
        // Code here
        int flip = 0;
        for(int i=0; i<S.length(); i++){
            char ch = S.charAt(i);
            if(i%2 == 0){
                if(ch == '0') flip++;
            }
            else if(i%2 != 0){
                if(ch == '1') flip++;
            }
        }
        return Math.min(flip,S.length()-flip);
    }
}