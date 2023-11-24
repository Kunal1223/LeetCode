//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
public class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n;
                    n = sc.nextInt();
                    ArrayList<String> arr = new ArrayList<String>();
                    for(int i = 0;i<n;i++)
                        {
                            String p = sc.next();
                            arr.add(p);
                        }
                    String line = sc.next();
                    Sol obj = new Sol();  
                    System.out.println(obj.wordBreak(line,arr));  
                    
                }
        }
}
// } Driver Code Ends


//User function Template for Java


class Sol
{
    static boolean DFS(int I,String A,HashSet<String> set,int n)
    {
        if(I==n)
        return true;
        String str = "";
        for(int i=I;i<n;i++)
        {
            str+=A.charAt(i);
            if(set.contains(str))
            if(DFS(i+1,A,set,n))
            return true;
        }
        return false;
    }
    public static int wordBreak(String A, ArrayList<String> B )
    {
        //code here
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<B.size();i++)
        set.add(B.get(i));
        if(DFS(0,A,set,A.length()))
        return 1;
        else
        return 0;
    }
}