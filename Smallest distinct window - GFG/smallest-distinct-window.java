//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String str = br.readLine();
            
            Solution obj = new Solution();
            System.out.println(obj.findSubString(str));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution {
    public int findSubString( String str) {
        // Your code goes here
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        HashMap<Character,Integer> map = new HashMap<>();
        int ans=Integer.MAX_VALUE;
        for(int i=0,j=0;i<str.length();i++){
            char ch = str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size()==set.size()&&j<str.length()){
                char c = str.charAt(j);
                map.put(c,map.get(c)-1);
                if(map.get(c)<=0){
                    map.remove(c);
                    ans=Math.min(ans,i-j+1);
                }
                j++;
            }
        }
        return ans;
    }
}