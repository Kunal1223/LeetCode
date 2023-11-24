//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
    		System.out.println (new Sol().countRev (s));
        }
        
    }
}
// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int countRev (String s)
    {
        if(s.length() % 2 != 0) return -1;
        int op = 0, cl = 0, cc = 0;
        for(char ch : s.toCharArray()){
            // System.out.print("op:" + op + " cl: " + cl);
            if(ch == '{') op++;
            else{
                cl++;
                if(cl > op){
                    cc++;
                }else{
                    op--;
                }
                cl = 0;
            }
            // System.out.println(" cc: " + cc);
        }
        return (int)(Math.ceil(op/2.0) + Math.ceil(cc/2.0));
    }
}