//{ Driver Code Starts
//Initial Template for Java

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
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            long n = Long.parseLong(stt.nextToken());
            long m = Long.parseLong(stt.nextToken());
            long a1[] = new long[(int)(n)];
            long a2[] = new long[(int)(m)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a1[i] = Long.parseLong(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                a2[i] = Long.parseLong(inputLine1[i]);
            }
            
            
            Compute obj = new Compute();
            System.out.println(obj.isSubset( a1, a2, n, m));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        Map<Long, Long> s = new HashMap<Long, Long>();
        for(int i = 0; i<n; i++){
            if(s.containsKey(a1[i])){
                long v = s.get(a1[i]);
                s.put(a1[i], v+1);
            }else{
                s.put(a1[i], 1L);
            }
        }
        for(int i = 0; i<m; i++){
            if(!s.containsKey(a2[i])){
                return "No";
            }else{
                long v = s.get(a2[i]);
                if(v==1){
                    s.remove(a2[i]);
                }else{
                    s.put(a2[i], v-1);
                }
            }
        }
        return "Yes";
    }
}